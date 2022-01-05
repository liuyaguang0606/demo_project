package com.yzzg.biz;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.net.URL;
import java.util.concurrent.CountDownLatch;

/**
 * Unit test for simple App.
 */
public class AppTest02
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(5);

        for (int i = 0; i < 6; i++) {
            new Thread(new MyRunable(latch,i)).start();
        }

        System.out.println("等待线程开始工作。。。。。");
        latch.await();
        System.out.println("结束");


    }

}


