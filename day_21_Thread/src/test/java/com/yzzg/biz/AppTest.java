package com.yzzg.biz;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    public static boolean num;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread("t1") {
            @Override
            public void run() {
                while (true) {
                    System.out.println("park befor : " + Thread.currentThread().getState());
                    LockSupport.park();
                    System.out.println("park after : " + Thread.currentThread().getState());
                    Thread.interrupted();
                    System.out.println("interrupted :: " + Thread.currentThread().getState());
                    boolean interrupted = Thread.currentThread().isInterrupted();
                    System.out.println("是否被打断 ==1== " + interrupted);
                }
            }
        };

        System.out.println("开始前" + t1.getState());
        t1.start();
        Thread.sleep(2000);
        System.out.println("开始后" + t1.getState());
        Thread.sleep(2000);


        boolean interrupted = t1.isInterrupted();
        System.out.println("是否被打断 1 = " + interrupted);
        System.out.println("interrupted :: " + t1.getState());

        t1.interrupt();
        boolean interrupted2 = t1.isInterrupted();
        System.out.println("是否被打断 2 = " + interrupted2);
        System.out.println("interrupt :: " + t1.getState());
        System.out.println("===================================================");

        t1.interrupt();
        System.out.println("main end");
    }


    public void test01() throws InterruptedException {
        AtomicReference<Teacher> ar = new AtomicReference<>(new Teacher());

        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println("==");
            }
        };
        t1.join(1000);


        Thread.yield();

    }

    class Teacher{

        private String name;

    }



}
