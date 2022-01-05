package com.yzzg.biz;

import java.util.concurrent.CountDownLatch;

public class MyRunable implements Runnable {

    private final CountDownLatch await;
    private final int  num;

    public MyRunable(CountDownLatch await, int num) {
        this.await = await;
        this.num = num;
    }

    @Override
    public void run() {
        try {
            System.out.println("线程" + num + "执行完毕");
            await.countDown();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


}
