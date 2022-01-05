package com.yzzg.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class UnsafeDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        /**
         * sun 公司提供的 最底层，可以绕过Java 虚拟机 加载 运行机制 来不用创建对象，就可以调用对象里面的方法使用
         * 1、首选还是通过反射的机制 获取Unsafe 类对象
         * 2、分析发现 通过Unsafe 类的对象实例可以绕过JVM运行机制，从而直接实现指定类的方法调用，并且连实例化的操作都省了；
         * 完全打破了 Java运行机制，
         */
        Class clazz = Unsafe.class;
        // 通过反射 获取Unsafe类型的成员属性
        Field theUnsafe = clazz.getDeclaredField("theUnsafe");
        // 授权访问
        theUnsafe.setAccessible(true);
        // 获取Unsafe 对象
        Unsafe unsafe = (Unsafe) theUnsafe.get(null);
        // 获取对象实例   ---- 可以看出Singleton 类中  的构造方法 未被调用
        Singleton instance = (Singleton) unsafe.allocateInstance(Singleton.class);
        instance.print();


    }
}
