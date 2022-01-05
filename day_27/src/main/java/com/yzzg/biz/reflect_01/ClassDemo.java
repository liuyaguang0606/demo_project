package com.yzzg.biz.reflect_01;

/**
 * 获取Class字节码文件对象的三种方式
 * 1、Object 类中的方法 getClass();
 * 2、数据类型的 静态属性class    ;  int.class    Person.class
 * 3、Class.forName();
 */
public class ClassDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //1、获取Class字节码文件对象
        Class c1 = Class.forName("com.yzzg.biz.reflect_01.Person");
        System.out.println(c1);
        //2、获取Class字节码文件对象
        Class c2 = Person.class;
        System.out.println(c2);

        //3、
        Person p = new Person();
        Class c3 = p.getClass();
        System.out.println(c3);

        System.out.println(c1 == c2);
        System.out.println(c1 == c3);

    }
}
