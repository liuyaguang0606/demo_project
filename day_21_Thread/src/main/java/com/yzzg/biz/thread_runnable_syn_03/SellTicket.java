package com.yzzg.biz.thread_runnable_syn_03;

public class SellTicket implements Runnable {

    private int ticket = 100;
    private Object obj = new Object();


    @Override
    public void run() {
        while (true) {
            synchronized (obj) {

            if (ticket > 0) {
//                synchronized (obj) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票");
                }
            }
        }
    }
}
