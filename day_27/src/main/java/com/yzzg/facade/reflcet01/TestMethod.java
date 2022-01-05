package com.yzzg.facade.reflcet01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 获取字节码对象
 * 1、Object.getClass();
 * 2、数据类型 的静态属性class : int.class; Person.class;
 * 3、字节码对象的静态方法 forName()  ; Class.forName();
 */
public class TestMethod {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class c = Class.forName("com.yzzg.facade.reflcet01.Person");
        // 通过构造器对象创建
        Constructor con = c.getConstructor();
        Object obj = con.newInstance();


        // 获取所有公共方法 ,获取自己的所有公共方法 和父类的所有公共方法
//        Method[] methods = c.getMethods();
//        for (Method m : methods) {
//            System.out.println(m);
//        }

//        Method[] methods = c.getDeclaredMethods();
//        for (Method m : methods) {
//            System.out.println(m);
//        }

        Method method = c.getMethod("pubTest1");
        method.invoke(obj);

        method = c.getDeclaredMethod("preTest1", String.class);
        method.setAccessible(true);
        method.invoke(obj, "nihao");

        method = c.getDeclaredMethod("defaultTest2", int.class);
        method.setAccessible(true);
        Object result = method.invoke(obj, 6666);
        System.out.println("调用的方法名：methodName=" + result);


    }
}
