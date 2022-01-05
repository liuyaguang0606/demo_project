package com.yzzg.biz.reflect_genericity_05;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class reflectFanxingDemo {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // 反射越过泛型检查
        ArrayList<Integer> array = new ArrayList<>();
        array.add(100);

        // 1 泛型 是在编译时期 泛型检查，运行时期不存在泛型
        // 通过反射 拿到字节码文件对象 可以越过泛型在编译时期检查
        Class c = array.getClass();
        Method m = c.getDeclaredMethod("add", Object.class);
        Object obj = m.invoke(array, "hello");

        System.out.println(obj);
        System.out.println(array);
    }
}
