package com.yzzg.biz.thread_consumer_proverd_05;

public class StudentDemo {
    public static void main(String[] args) {
        // 1、创建资源对象
        Student s = new Student();

        // 2、创建实现类
        SetThread st = new SetThread(s);
        GetThread gt = new GetThread(s);

        // 3、创建线程对象
        /**
         * 创建两个线程 ： 一个线程生产者 ， 设置学生； 一个线程消费者 ，获取学生
         */
        Thread t1 = new Thread(st, "设置学生");
        Thread t2 = new Thread(gt, "获取学生");

        // 4、启动线程
        t1.start();
        t2.start();
    }
}
