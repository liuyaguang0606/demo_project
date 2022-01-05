package com.yzzg.biz.thread_executors_06;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new MyCallable());
        es.submit(new MyCallable());
        Future f3 = es.submit(new MyCallable());
        Future f4 = es.submit(new MyCallable());
        System.out.println(f3.get());
    }
}
