package com.yzzg.biz.thread_01;


/**
 * 线程安全问题：
 *      1、是否是多线程环境     是
 *      2、是否有共享数据    是
 *      3、是否有多条语句操作共享数据     是
 *
 *
 *  解决方案：
 *      使用锁机制
 *          1、synchronized
 *          2、显示加锁 Lock  lock
 */
public class StudentDemo {

    public static void main(String[] args) {
        // 创建学生资源
        StudentResource sr = new StudentResource();

        // 生产线程
        // 消费线程
        ProducerThread pt = new ProducerThread(sr);
        ConsumerThread ct = new ConsumerThread(sr);

        //线程类
        Thread producerThread = new Thread(pt);
        Thread consumerThread = new Thread(ct);

        // 开启线程
        consumerThread.start();
        producerThread.start();


    }

}
