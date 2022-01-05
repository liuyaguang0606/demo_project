package com.yzzg.biz.singleton;

/**
 * 懒汉式 的一种写法
 */
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4(){

    }

    /**
     * 双重判断增加性能
     * synchronized 解决同步安全
     * @return
     */
    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if(instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
