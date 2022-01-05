package com.yzzg.biz.reflect_factory_04;

public class DynamicCarFactory {

    private DynamicCarFactory(){

    }

    public static Automaker getInstance(String className) {
        try {
            Object obj =  Class.forName(className).getDeclaredConstructor().newInstance();
            if (obj instanceof Automaker){
                return (Automaker) obj;
            }
            return null;
        }catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
