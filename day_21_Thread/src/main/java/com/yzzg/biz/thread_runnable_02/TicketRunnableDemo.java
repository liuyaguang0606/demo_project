package com.yzzg.biz.thread_runnable_02;

/**
 * 使用实现 Runnable 接口 更能体现 线程共享资源 与 线程独立分开的逻辑关系
 * 1、线程共享资源逻辑封装在 实现 Runnable接口的子类中
 * 2、线程创建时 将线程共享资源 通过创建线程的构造方法传入 实现分离
 */
public class TicketRunnableDemo {
    public static void main(String[] args) {
        // 1、线程共享资源对象
        TicketRunnable tr = new TicketRunnable();

        // 2、创建线程对象
        Thread t1 = new Thread(tr,"线程1_窗口1");
        Thread t2 = new Thread(tr,"线程2_窗口2");
        Thread t3 = new Thread(tr,"线程3_窗口3");

        // 3、启动线程
        t1.start();
        t2.start();
        t3.start();


    }
}
