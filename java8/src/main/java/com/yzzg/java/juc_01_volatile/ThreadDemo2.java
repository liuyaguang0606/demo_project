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
 *   1、说明 volatile  不能保证 原子性操作，如何解决 ，引出 java.util.concurrent.atomic包下常用的 原子性类
 *
 *  2、jdk1.5之后java.util.concurrent.atomic包下 提供了原子变量
 *      2.1、volatile ： 保证内存可见性
 *      2.2、CAS 是应用对于并发操作共享数据的支持
 *          CAS 包含了三个操作数：
 *          内存值：V
 *          预估值：A
 *          更新值：B
 *          当且仅当 V == A 时，V=B, 否则什么都不操作；
 *
 *
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        ThreadUpdateDemo2 td = new ThreadUpdateDemo2();

        for (int i = 0; i < 10; i++){
            new Thread(td).start();
        }

        // 出现的现象
        /**
         *         0
         *         0
         *         0
         *         3
         *         2
         *         1
         *         4
         *         6
         *         5
         *         7
         *
         *        说明 volatile  不能保证 原子性操作，如何解决 ，引出 java.util.concurrent包下常用的 原子性类
         */

    }
}
