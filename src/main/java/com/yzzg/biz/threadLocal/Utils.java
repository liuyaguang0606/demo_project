package com.yzzg.biz.threadLocal;

import java.util.HashMap;

public class Utils {

    static ThreadLocal<String> local = new ThreadLocal<>();
    ThreadLocal<String> ss = new ThreadLocal<>();


    static String getString() {
        System.out.println(Thread.currentThread().getName() + "---->" + local);
        return local.get();
    }

    static void setLocal(int ss){
        System.out.println("set = " + Thread.currentThread().getName() + ":::" + local);
        local.set(ss + "");
    }
}
