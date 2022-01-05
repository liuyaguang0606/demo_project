package com.yzzg.biz.thread_executors_06;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private static final String str = new String();

    @Override
    public String call() throws Exception {
        synchronized (str) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
        return "100";
    }

}
