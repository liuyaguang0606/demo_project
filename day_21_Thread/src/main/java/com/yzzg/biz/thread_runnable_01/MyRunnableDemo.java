package com.yzzg.biz.thread_runnable_01;

public class MyRunnableDemo {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable my = new MyRunnable();

        Thread t1 = new Thread(my);
        Thread t2 = new Thread(my);
        Thread t3 = new Thread(my);

        t1.setName("t1_zhangsan");
        t2.setName("t2_lisi");
        t3.setName("刘备");

        t3.start();
        t3.setDaemon(true);
        t1.start();
        t1.join();
        t2.start();
        t3.interrupt();

    }
}
