package com.yzzg.biz.reflect_singleton_03;

public class SingletonDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            new Runnable(){
                @Override
                public void run() {
                    Singleton singleton = Singleton.getInstance();
                    singleton.toString();
                }
            };
        }
    }
}
