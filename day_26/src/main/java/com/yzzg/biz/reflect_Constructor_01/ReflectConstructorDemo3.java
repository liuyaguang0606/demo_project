package com.yzzg.biz.reflect_Constructor_01;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 需求：通过反射获取私有构造方法 创建实例
 */
public class ReflectConstructorDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        // 1、获取字节码文件对象
        Class c = Class.forName("com.yzzg.biz.reflect_Constructor_01.Person");

        // 2、获取私有的 带参的构造方法 对象
        Constructor con = c.getDeclaredConstructor(String.class);
        // 获取该私有的报非法的访问异常
        //暴力访问
        con.setAccessible(true);   // 值为true 则指示反射的对象在使用时应该取消Java语言访问检查。

        //3、通过构造方法对象 调用方法创建对象
        Object obj = con.newInstance("haha");

        System.out.println(obj);


    }
}
