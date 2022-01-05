package com.yzzg.biz.thread_runnable_syn_03;

public class SellTicketDemo {
    public static void main(String[] args) {
        // 1、创建资源
        SellTicket st = new SellTicket();

        // 2、创建线程
        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口2");
        Thread t3 = new Thread(st, "窗口3");

        // 3、开启线程
        t1.start();
        t2.start();
        t3.start();


    }
}
