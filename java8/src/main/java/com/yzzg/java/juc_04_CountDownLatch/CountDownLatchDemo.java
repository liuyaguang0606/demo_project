package com.yzzg.java.juc_04_CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * countDownLatch : 闭锁：在完成某些运算时，只有当其他所有线程计算都执行完成，当前计算才继续执行；
 */
public class CountDownLatchDemo {
    // 这里注意一下 这个要做减减 操作 不能定义 final
    private static int THREAD_COUNT = 5;

    public static void main(String[] args) {

        final CountDownLatch countDownLatch = new CountDownLatch(THREAD_COUNT);
        LatchDemo ld = new LatchDemo(countDownLatch);

        long start = System.currentTimeMillis();
        for (int i = 0; i < THREAD_COUNT; i++){
            new Thread(ld).start();
        }

        // 等待其他所有线程执行完毕 才执行
        try {
            countDownLatch.wait();
        } catch (InterruptedException e) {
            long end = System.currentTimeMillis();
            System.out.println("所有异步线程执行完毕需要花费多久时间 time：" + (end - start));
        }


    }
}



class LatchDemo implements Runnable{

    private CountDownLatch latch;

    public LatchDemo(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {

        synchronized (this) {
            try {
                for (int i = 0; i < 10; i++) {
                    if (i % 2 == 0) {
                        System.out.println("i=" + i);
                    }
                }
            }finally {
                latch.countDown();
            }

        }

    }
}
