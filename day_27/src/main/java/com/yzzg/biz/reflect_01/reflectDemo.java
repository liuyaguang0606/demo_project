package com.yzzg.biz.reflect_01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1、先获取字节码文件对应的对象
        Class c = Class.forName("com.yzzg.biz.reflect_01.Person");
        //2、获取属性
        /**
         * Field[]  getFields()
         * Field    getField(String name)
         *
         * Field    getDeclaredField(String name)
         * Field[]  getDeclaredFields()
         */
//        Field[] fields = c.getFields();
//        for (Field field : fields){
//            System.out.println(field);
//        }
        Field field = c.getField("address");
        System.out.println(field);
        Field field2 = c.getDeclaredField("name");
        System.out.println(field2);

        // 反射调用方法
//        Constructor con = c.getConstructor();
//        con.setAccessible(true);
//        Object obj = con.newInstance();
//        System.out.println(obj);
        Constructor con = c.getDeclaredConstructor(String.class);
        con.setAccessible(true);
        Object obj = con.newInstance("ceshi");
        System.out.println(obj);

        Method method = c.getDeclaredMethod("haha", String.class);
        method.setAccessible(true);
        Object mobj = method.invoke(obj, "你好");
        System.out.println(mobj);
        System.out.println("-------------------");
        // getDeclaredMethods  只能获取本类的所有方法
        Method[] methodss = c.getDeclaredMethods();
        for (Method methodss1 : methodss) {
            System.out.println(methodss1);
        }
        System.out.println("++++++++++++++++++++++++++++++");
        // getMethods() ： 获取本类 以及父类的所有 公共的方法
        Method[] m = c.getMethods();
        for (Method method1 : m) {
            System.out.println(method1);
        }

        System.out.println("==================");
        Class clazz = c.getSuperclass();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method1 : methods) {
            System.out.println(method1);
        }



    }
}
