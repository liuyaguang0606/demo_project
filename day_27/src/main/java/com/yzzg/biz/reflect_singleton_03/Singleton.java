package com.yzzg.biz.reflect_singleton_03;

public class Singleton {

    private static volatile Singleton instance;
    private Singleton(){
        System.out.println("【" + Thread.currentThread().getName() + "】实例化Singleton对象");
    }

    public static Singleton getInstance(){
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
            return instance;
        }
        return instance;
    }

    @Override
    public String toString() {
        return "单例singleton toString()";
    }
}







