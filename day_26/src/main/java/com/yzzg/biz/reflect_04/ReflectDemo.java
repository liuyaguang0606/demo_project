package com.yzzg.biz.reflect_04;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1、加载读取配置文件
        Properties  properties = new Properties();
        FileReader fileReader = new FileReader("day_26/class.txt");
        properties.load(fileReader);

        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        // 2、创建字节码文件 对象Class
        Class c = Class.forName(className);
        // 3、创建构造方法
        Constructor con = c.getDeclaredConstructor();
        // 4、创建对象
        Object obj = con.newInstance();

        // 创建方法
        Method m = c.getDeclaredMethod(methodName, String.class);
        m.invoke(obj,"红烧肉");




    }
}
