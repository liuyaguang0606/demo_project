package com.yzzg.biz.reflect_Field_02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射获取 字段值属性
 */
public class ReflectFieldDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1、获取字节码文件的对象
        Class c = Class.forName("com.yzzg.biz.reflect_Field_02.Person");
        // 2、通过反射 获取构造方法 创建对象
        Constructor con = c.getConstructor();
        // con.setAccessible(true);
        // 3、创建对象
        Object obj = con.newInstance();

        //3、获取单个的成员属性
//        Field field = c.getField();  // 获取单个公共的成员属性
//        Field[] fields = c.getFields();  // 获取所有public 公共的成员属性
//        Field field  = c.getDeclaredField("");  // 获取单个 任意成员属性
//        Field[] fields = c.getDeclaredFields();  // 获取所有的成员属性
        // public 修饰
        Field addressField = c.getField("address");
        addressField.set(obj, "河南省商丘市虞城县");
        System.out.println(obj);

        // name 使用的时私有修饰符修饰
        Field nameField = c.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(obj, "zhangsan");
        System.out.println(obj);

        // age 是默认修饰符修饰 获取使用declaredField
        Field ageField = c.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(obj, 28);
        System.out.println(obj);


        // age 是默认修饰符修饰 获取使用declaredField
        Field ageFieldsss = c.getField("age");
        ageField.set(obj, 233);
        System.out.println(obj);

    }
}
