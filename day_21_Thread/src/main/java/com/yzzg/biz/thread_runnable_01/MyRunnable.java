package com.yzzg.biz.thread_runnable_01;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
//            Thread.yield();
        }
    }
}
