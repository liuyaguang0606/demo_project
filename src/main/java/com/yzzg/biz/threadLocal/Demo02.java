package com.yzzg.biz.threadLocal;

import java.util.concurrent.ConcurrentHashMap;

public class Demo02 {
    public static void main(String[] args) {
        final Demo03 demo03 = new Demo03();
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "  : 进入set");
            int[] ints = new int[]{1,2,3};
            demo03.set(ints);
            System.out.println(Thread.currentThread().getName() + "  : 进入get");
            int[] ints1 = demo03.get();
            for (int i : ints1) {
                System.out.println(Thread.currentThread().getName() + " ==i==" +i );
            }
        },"T1>>").start();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "  : 进入set");
            int[] ints = new int[]{6,7,8};
            demo03.set(ints);
            System.out.println(Thread.currentThread().getName() + "  : 进入get");
            int[] ints1 = demo03.get();
            for (int i : ints1) {
                System.out.println(Thread.currentThread().getName() + " ==i==" +i );
            }
        },"T2>>>>").start();


    }
}
class Demo03 {
    ThreadLocal<int[]> local = new ThreadLocal<>();

    void set(int[] str) {
        local.set(str);
//        Utils.setLocal(str);
    }

    int[] get(){
        return local.get();
    }

}
