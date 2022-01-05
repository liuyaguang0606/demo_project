package com.yzzg.biz.thread_group_02;

/**
 * 线程组： 把多个线程组合到一起
 *  它可以对一批线程分类管理，Java允许程序可以直接对线程组 管理操作；
 */
public class ThreadGroupDemo {

    public static void main(String[] args) {

//        method1();
        method2();

    }

    public static void method2() {
        // 创建一个线程组
        ThreadGroup tg = new ThreadGroup("自己创建的线程组");

        // 创建线程资源
        MyRunnable my = new MyRunnable();
        // 通过Threade 构造方法可以知道 创建线程时可以指定线程组
        Thread  t1 = new Thread(tg, my, "张三");
        Thread  t2 = new Thread(tg, my, "李四");

        System.out.println("自定义线程组：" + t1.getThreadGroup().getName());
        System.out.println("自定义线程组：" + t2.getThreadGroup().getName());

    }

    public static void method1(){
        MyRunnable rs = new MyRunnable();
        Thread t1 = new Thread(rs);
        Thread t2 = new Thread(rs);

        ThreadGroup tg1 = t1.getThreadGroup();
        ThreadGroup tg2 = t2.getThreadGroup();

        System.out.println(tg1.getName());
        System.out.println(tg2.getName());
        System.out.println(Thread.currentThread().getThreadGroup().getName());

    }

}
