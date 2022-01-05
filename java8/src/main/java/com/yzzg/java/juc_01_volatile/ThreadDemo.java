package com.yzzg.java.juc_01_volatile;

/**
 * 一、通过下面这个例子 引出内存可见性问题
 *  1.volatile关键字 解决共享数据内存可见性的问题
 *  2.synchronized () 也可以 解决共享数据可见性问题，synchronized 是通过重量级锁机制来实现
 *
 *  注意：volatile 与 synchronized 最大的区别？
 *      1、volatile 不能保证线程的 “互斥性”
 *      2、volatile 不能保证 数据的 “原子性操作”
 *      3、synchronized 是线程互斥的
 *
 *
 * * * 三、下面在上面的基础之上增加了volatile 修饰共享数据 flage 问题得到解决；
 *  又新增一个问题,变更需求： 开10个线程 获取自增数据；
 */
public class ThreadDemo {
    public static void main(String[] args) {
        ThreadUpdateDemo tud = new ThreadUpdateDemo();
        new Thread(tud).start();


        // 主线程 不停的循环遍历获取标签
        while (true){
            if (tud.isFlage()){
                System.out.println("主线程 打印 flage=" + tud.isFlage());
            }
        }

        /**
         * 最终现象 主线程 日志没有打印 ， 分析原因：
         *  因为底层 jvm 会为每个线程分配一份临时缓存区，
         *  主线程 while循环调用底层操作系统方法，不停的从缓冲区中读取数据，可以理解主存的操作对主线程是不可见的
         */
    }
}
