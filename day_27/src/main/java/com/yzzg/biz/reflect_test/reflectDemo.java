package com.yzzg.biz.reflect_test;

import com.yzzg.biz.reflect_test.annotation.Cache;
import com.yzzg.biz.reflect_test.annotation.Test02;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Struct;

public class reflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        /**
         * 在Java面向对象 语言中万事万物皆对象
         * 字节码文件 描述类Class 是反射的基石
         * 那么有几种获取 字节码类对象？
         * 1、通过字节码类的静态方法 Class forName(String name)  返回字节码对象
         * 2、万事万物皆对象,可以使用数据类型的静态属性字段class, 数据类型.class
         * 3、使用Object 类中的 getClass() 方法 返回字节码对象
         */
        // Student student = new Student("zhangsan");
        // Class sc = student.getClass();
        // Class c = Student.class;
        Class clazz = Class.forName("com.yzzg.biz.reflect_test.Student");

        /**
         * 1、获取构造方法
         *  Constructor[]  getConstructors()   : 返回当前类的所有公共的 构造方法
         *  Constructor   getConstructor(Class... type) : 返回一个公共的 指定构造方法 , 只针对公共类型方法使用
         *  Constructor[] getDeclaredConstructors() :  返回当前类的所有构造方法 包括 私有、默认、public
         *  Constructor   getDeclaredConstructor(Class... type) :  返回任意一个指定的构造方法
         */
        /*Constructor[] cons = clazz.getConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }*/
        /*Constructor con = clazz.getConstructor(String.class);
        Student obj = (Student) con.newInstance("zhangsan");
        System.out.println(obj);*/
        /*Constructor[] cons = clazz.getDeclaredConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }*/
        Constructor con = clazz.getDeclaredConstructor();
        con.setAccessible(true);
        System.out.println(con);
        Student student = (Student) con.newInstance();
        System.out.println(student);
        System.out.println("==========================================");
        /**
         * 2、获取方法  考虑一个问题 静态的成员方法是否也可以通过这种方法获取
         *  Method[]    getMethods() : 获取当前类以及父类的 所有的 公共的方法
         *  Method  getMethod(String methodName, Class... paramType) : 获取当前类以及父类的 指定的公共的方法
         *  Method[]   getDeclaredMethods : 获取当前类的所有方法列表包括
         *  Method  getDeclaredMethod(String methodName, Class... paramType) : 获取前类中任意一个指定的方法
         */
        /*Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/

        // 获取静态方法操作
        /*Method method = clazz.getMethod("staticMethod");
        method.setAccessible(true);
        System.out.println(method);*/

        /*Method method = clazz.getMethod("hashCode");
        method.setAccessible(true);
        System.out.println(method);*/
        /*Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/
        Method method = clazz.getDeclaredMethod("sum", int.class, int.class);
         method.setAccessible(true);
        int sum = (int)method.invoke(student, 2, 3);
        System.out.println(method);
        System.out.println("=============================================");

        /**
         * 3、获取成员属性字段
         * 考虑一个问题 静态的成员
         * Field[]  getFields() : 返回当前类以及父类中所有 公共的属性字段对象列表 包括静态属性 只要是public
         * Field    getField(String fieldName) : 返回当前类以及父类中 任意指定的属性字段对象
         * Field[]  getDeclaredFields() : 返回当前类中 所有的字段属性对象 ,不能获取父类中的无论父类字段时使用什么权限修饰
         * Field    getDeclaredField(String fieldName) : 返回当前类中 所有的字段属性对象 ,不能获取父类中的无论父类字段时使用什么权限修饰
         */
        /*Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }*/
        /*Field field = clazz.getField("personName");
        System.out.println(field);*/
        /*Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }*/
        Field field = clazz.getDeclaredField("age");
        System.out.println(field);
        System.out.println("=============================================");
        /**
         * 4、获取注解  Annotation
         *  获取注解有个注意事项 : 要看注解在什么时机 生效
         *  Annotation[]    getAnnotations() : 返回当前类的注解
         *  Annotation  getAnnotation(Class annotation) : 返回
         *  Annotation[]    getDeclaredAnnotations() :
         *  Annotation  getDeclaredAnnotation(Class annotation) :
         */
        /*Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.annotationType());
        }*/
        /*Annotation annotation = clazz.getAnnotation(Cache.class);
        System.out.println(annotation);*/
        /*Annotation[]  annotation = clazz.getDeclaredAnnotations();
        for (Annotation annotation1 : annotation) {
            System.out.println(annotation1);
        }*/
        Annotation annotation = clazz.getDeclaredAnnotation(Test02.class);
        Test02 test02 = (Test02)annotation;
        System.out.println(test02.name());



    }
}
