package com.yzzg.biz.reflect_factory_04;

public class StaticCarFactory {

    private StaticCarFactory(){}

    public static Automaker getInstance(String name){
        if ("hongqi".equalsIgnoreCase(name)){
            return new HongQiStore();
        }else if("dazhong".equalsIgnoreCase(name)){
            return new DaZhongStore();
        }else if ("baoma".equalsIgnoreCase(name)){
            return new BaoMaStore();
        }else {
            return null;
        }

    }

}
