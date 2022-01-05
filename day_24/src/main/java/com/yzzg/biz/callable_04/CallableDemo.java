package com.yzzg.biz.callable_04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableDemo {
    public static void main(String[] args) {
        // 创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(2);

        // 提交Callable 实现子类
        pool.submit(new MyCallable());
        pool.submit(new MyCallable());

        //关闭线程池，不在等待接收新的线程，而是关闭
        pool.shutdown();
    }

}
