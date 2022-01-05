package com.yzzg.biz.executors_03;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池：缓存线程的池子
 * 线程池的好处：线程池里面的线程执行完毕可以被线程池回收，并不会死亡，下次可以被直接使用；
 * 如何实现一个线程池呢？
 *      1、创建一个线程池对象，控制要创建几个线程
 *      public static ExecutorService  newFixedThreadPool(int thread)
 *      2、这种线程池的线程可以执行
 *          2.1、可以执行Runnable代表的对象和Callable代表的对象；
 *          2.2、做一个类实现Runnable接口
 *      3、调用如下接口
 *          Future<?> submit(Runnable task)
 *          <T> Future</T> submit(Callable<?> task)
 *
 *      4、我要结束可以吗?
 *          可以
 *
 *
 * */
public class ExecutorsDemo {
    public static void main(String[] args) {

        // 使用Executors 创建2个线程的线程池
        ExecutorService pool = Executors.newFixedThreadPool(2);

        // 提交
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());

        //

    }
}
