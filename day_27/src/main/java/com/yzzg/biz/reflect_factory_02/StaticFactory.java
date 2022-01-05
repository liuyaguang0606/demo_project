package com.yzzg.biz.reflect_factory_02;

public class StaticFactory {
    private StaticFactory(){}

    public static IBook getInstance(String className){
        if ("math".equalsIgnoreCase(className)) {
            return new MathBook();
        }else if ("program".equalsIgnoreCase(className)){
            return new ProgramBook();
        }else {
            return null;
        }

    }
}
