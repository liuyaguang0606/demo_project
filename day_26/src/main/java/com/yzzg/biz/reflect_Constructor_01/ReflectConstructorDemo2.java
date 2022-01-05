package com.yzzg.biz.reflect_Constructor_01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 需求；通过带参的构造函数创建实例对象
 * person(String name, int age, String address)
 */
public class ReflectConstructorDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取字节码文件对应的 对象
        Class c = Class.forName("com.yzzg.biz.reflect_Constructor_01.Person");

        // 获取带参的构造方法
        Constructor con = c.getConstructor(String.class, int.class, String.class);

        // 通过构造方法对象Constructor 调用方法创建实例对象
        Object obj = con.newInstance("zhangsan", 25, "河南省商丘市");
        // 打印创建的实例
        System.out.println("obj: " + obj);
    }
}
