package com.yzzg.biz.reflect_annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectAnnotationDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Class.forName("com.yzzg.biz.reflect_annotation.Person");
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("annotation:" + annotation);
        }

        Constructor con = clazz.getConstructor();
        Object obj = con.newInstance();


        // 获取方法上面的
        Method method = clazz.getDeclaredMethod("calcMethod", int.class, int.class);
        Annotation a = method.getAnnotation(MyTest.class);
        System.out.println("a : " + a);
        method.setAccessible(true);
        method.invoke(obj,1, 2);
    }
}
