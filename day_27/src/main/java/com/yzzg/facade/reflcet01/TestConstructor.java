package com.yzzg.facade.reflcet01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


/**
 * 获取字节码的三种方式：
 * 1、通过Object类中的getClass()方法获取，这个前提是已经获取到对象
 *  Person person = new Person()
 *  Class clazz = person.getClass();
 * 2、通过数据类型的静态属性class 获取
 *  Class clazz = int.class;
 *  Class p = Person.class;
 * 3、通过字节码类型 的静态方法获取
 *  Class c = Class.forName(String classPath);
 */
public class TestConstructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /**
         * Java中获取字节码对象的三种方式
         * 1、Object.getClass();
         * 2、int.class;  Person.class;
         * 3、Class.forName(String classPath);
         */

        Class c = Class.forName("com.yzzg.facade.reflcet01.Person");
        // 获取所有的公共的构造方法
        Constructor[] cons = c.getConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }
        System.out.println("==========================");
        // 获取所有的构造方法
        Constructor[] conss = c.getDeclaredConstructors();
        for (Constructor con : conss) {
            System.out.println(con);
        }
        System.out.println("======================");
        // 通过单个公共构造方法创建对象
        Constructor con = c.getConstructor();
        Object object = con.newInstance();
        System.out.println(object);
        System.out.println("-----------------");
        // 通过私构造方法 创建对象
        Constructor cn = c.getDeclaredConstructor(int.class);
        cn.setAccessible(true);
        Object o = cn.newInstance(30);
        System.out.println(o);
        System.out.println("=======================");
        // 通过默认修饰符 创建对象 时 要使用declaredConstructor
        // 创建对象时 ，可以不设置accessible
        Constructor cs = c.getDeclaredConstructor(String.class);
        Object o1 = cs.newInstance("zhangsna");
        System.out.println(o1);
        System.out.println("------------------");
        // 通过多个参数创建对象
        Constructor ccon = c.getConstructor(String.class, int.class);
        Object ccoo = ccon.newInstance("cc", 50);
        System.out.println(ccoo);





    }
}
