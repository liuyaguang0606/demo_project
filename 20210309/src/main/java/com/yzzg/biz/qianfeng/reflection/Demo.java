package com.yzzg.biz.qianfeng.reflection;

import java.awt.*;
import java.beans.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.yzzg.biz.qianfeng.reflection.Person");
        // 获取私有的构造函数
        Constructor<?> constructor = aClass.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        System.out.println(constructor.newInstance("hahah"));
        // 获取公有的构造函数
        Constructor<?> constructor1 = aClass.getConstructor(String.class, Long.class);
        Object instance = constructor1.newInstance("sdd", 4L);
        System.out.println(instance);
        Method test = aClass.getDeclaredMethod("test");
        test.setAccessible(true);
        test.invoke(instance);
        // 获取包名
        Package aPackage = aClass.getPackage();
        String name = aPackage.getName();
        System.out.println(name);



    }
}
