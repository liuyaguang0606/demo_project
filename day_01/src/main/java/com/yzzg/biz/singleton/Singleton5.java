package com.yzzg.biz.singleton;

public class Singleton5 {
    private Singleton5(){}

    private static class Inner{
        private static final Singleton5 singleton = new Singleton5();
    }
    public static Singleton5 getInstance() {
        return Inner.singleton;
    }
}
