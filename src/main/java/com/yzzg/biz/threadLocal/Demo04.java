package com.yzzg.biz.threadLocal;

public class Demo04 {

    public static int[] ints = new int[]{1,2,3};

    static ThreadLocal<int[]> local = new ThreadLocal<>();

    static {
        local.set(ints);
    }

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " ....set");
            local.set(ints);
            System.out.println(Thread.currentThread().getName() + "  ......get");
            for (int i : local.get()) {
                System.out.println(Thread.currentThread().getName() + " i==" +i );
            }
        },"T1>>").start();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "  : 进入set");
            ints[0] = 66;
            ints[1] = 77;
            ints[2] = 88;
            local.set(ints);
            System.out.println(Thread.currentThread().getName() + "  : 进入get");
            for (int i : local.get()) {
                System.out.println(Thread.currentThread().getName() + " i==" +i );
            }
        },"T2>>>>").start();


    }


}
