package com.yzzg.biz.callable_upgrade_05;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/***
 * 有这样一个需求：
 *      有多个线程 分别计算一个求和运算，并分别获取计算结果
 */
public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(2);
        //
        Future<Integer> f1 = pool.submit(new MyCallable(100));
        Future<Integer> f2 = pool.submit(new MyCallable(200));

        int n1 = f1.get();
        int n2 = f2.get();

        System.out.println("线程1计算结果："+ n1);
        System.out.println("线程2计算结果："+ n2);

        //关闭线程池，不在等待接收新的线程，而是关闭
        pool.shutdown();
    }
}
