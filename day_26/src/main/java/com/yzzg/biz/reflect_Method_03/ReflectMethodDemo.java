package com.yzzg.biz.reflect_Method_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 通过反射获取对应的方法操作
 */
public class ReflectMethodDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /**
         * 获取Class 类型对象的方式
         *  1、Object 类中的 getClass()
         *  2、任意数据类型的静态属性 class   eg: Person.class
         *  3、开发常使用的方式： 通过Class的静态方法 forName();  eg:   Class.forName();
         */
        // 1、获取字节码文件 对应的Class 对象
        Class c = Class.forName("com.yzzg.biz.reflect_Method_03.Person");

        // 2、获取构造方法  获取无参的构造方法
        Constructor con = c.getConstructor();

        // 3、创建对象
        Object  obj = con.newInstance();

        // 4.1、获取调用  public void show() 方法

        Method m1 = c.getMethod("show");
        Object obj1 = m1.invoke(obj);
        System.out.println("obj1 : " + obj1);


        // 4.2、获取调用 public void method(String s)
        Method m2 = c.getMethod("method", String.class);
        Object obj2 = m2.invoke(obj, "haolou");
        System.out.println("obj2 : " + obj2);

        // 4.3、获取调用 public String getString(String s, int i)
        Method m3 = c.getMethod("getString", String.class, int.class);
        Object getString = m3.invoke(obj, "yaguang", 18);    // 有返回值  invoke 返回Object
        System.out.println(getString);

        // 4.4、获取调用 private void function()
        Method m4 = c.getDeclaredMethod("function");
        m4.setAccessible(true);
        m4.invoke(obj);








    }
}
