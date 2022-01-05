package com.yzzg.biz.reflect_factory_02;

public class DynamicFactory {

    public DynamicFactory(){}

    public static IBook getInstance(String className){
        try {
            Object obj = Class.forName(className).getDeclaredConstructor().newInstance();
            if (obj instanceof IBook) {
                return (IBook)obj;
            }
            return null;

        }catch (Exception e) {
            return null;
        }

    }

}
