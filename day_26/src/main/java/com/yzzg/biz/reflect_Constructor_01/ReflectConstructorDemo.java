package com.yzzg.biz.reflect_Constructor_01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * 一、反射： Java 反射机制是在运行状态中，
 * 对于任意一个类，都能知道该类的所有属性 和 方法；
 * 对于任意一个对象，都能调用它的任意一个方法 和 属性；
 * 这种动态获取信息，以及动态调用对象方法的功能 称为 Java语言的反射机制
 *
 * 要想解剖剖析一个类，必须先要获取到该类的字节码文件对象；
 * 而解剖使用的就是Class类中的方法
 * 所以先要获取每个字节码文件对应的Class类型 的 对象；
 *
 * 二、Person p = new Person();
 * p.使用
 * 要想这样使用，首先必须要得到class文件对象，其实也就是得到 Class类的对象；
 * Class类：
 *      成员变量 ： Field
 *      成员方法 ：Method
 *      构造方法 ：Constructor
 *
 *  三、获取字节码对象Class 方法：（三种）
 *      1、Object 类中的 getClass()方法   eg:  p.getClass();
 *      2、数据类型的静态属性class   eg:  Person.class
 *      3、Class类中的静态方法
 *          public static Class<> forName(String className) : className 类的全路径
 *
 */
public class ReflectConstructorDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 获取字节码文件对象
        Class c = Class.forName("com.yzzg.biz.reflect_Constructor_01.Person");

        //获取构造方法对象
        // public Constructor[] getConstructors() : 返回所有的公共构造方法
        // public Constructor[] getDeclaredConstructors() :返回所有的构造方法
//        Constructor[] cons = c.getDeclaredConstructors();
//        for (Constructor con : cons) {
//            System.out.println(con);
//        }
        // 获取单个空的构造方法
        Constructor con = c.getConstructor();

        // 通过构造方法对象 调用方法创建新的实例对象
        Object obj = con.newInstance();
        System.out.println(obj);
    }

}
