package com.yzzg.biz.callable_04;

import java.util.concurrent.Callable;


/**
 * Callable :是带泛型的，我们先不加上泛型练习
 *
 * Callable : 实现多线程是 基于线程池的使用， 使用线程类，是无法创建线程的；注意
 */
public class MyCallable  implements Callable {
    @Override
    public Object call() throws Exception {

        for (int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
        return null;
    }
}
