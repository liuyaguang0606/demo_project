package com.yzzg.biz.thread_runnable_02;

/**
 * 对比 实现Runnable 接口
 */
public class TicketThreadDemo {
    public static void main(String[] args) {
        // 1、创建线程
        SellerTicket t1 = new SellerTicket();
        SellerTicket t2 = new SellerTicket();
        SellerTicket t3 = new SellerTicket();

        // 2、设置线程名称
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        // 3、启动线程
        t1.start();
        t2.start();
        t3.start();

    }
}
