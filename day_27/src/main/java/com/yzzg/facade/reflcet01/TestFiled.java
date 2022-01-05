package com.yzzg.facade.reflcet01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class TestFiled {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        // 获取字节码对象
        Class clazz = Class.forName("com.yzzg.facade.reflcet01.Person");

        // 获取构造方法创建对象
        Constructor con = clazz.getConstructor();
        Object obj = con.newInstance();
        System.out.println("obj=" + obj);

        // *********************
        // 获取所有公共字段 是否包括父类的 -- (包括父类的public)
        Field[] fields = clazz.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }
        System.out.println("-------------------------");
        // 获取所有包括私有 是否包括父类的私有 -- 父类的所有都不包括，只获取自己的
        Field[] fieldss = clazz.getDeclaredFields();
        for (Field f : fieldss) {
            System.out.println(f);
        }
        System.out.println("---------------------");
        //***********************

        // 获取字段属性并赋值
        Field addressField = clazz.getField("address");
        addressField.set(obj, "西溪雅苑");
        System.out.println("obj=" + obj);

        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(obj, "zhangsan");
        System.out.println("obj=" + obj);

        Field ageField = clazz.getDeclaredField("age");
        // 可以访问 可设置setAccessible  也可以不设置setAccessible
//        ageField.setAccessible(true);
        ageField.set(obj, 23);
        System.out.println("obj=" + obj);


    }
}
