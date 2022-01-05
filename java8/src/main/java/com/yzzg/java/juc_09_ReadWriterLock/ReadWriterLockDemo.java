package com.yzzg.java.juc_09_ReadWriterLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 一、读写锁 ReadWriterLock
 *  写写 / 读写 需要 “互斥性”
 *  读读  不要互斥性
 *  注意：读写锁 最大的特点就是 锁的具体化：
 *   1、写写锁 / 读写锁  互斥
 *   2、读读 不互斥
 */
public class ReadWriterLockDemo {
    public static void main(String[] args) {
        TestReadWriterLock rw = new TestReadWriterLock();

        // 写锁
        new Thread(new Runnable() {
            @Override
            public void run() {
                rw.set((int) (Math.random() * 101));
            }
        }, "writer:").start();



        //读锁
        for (int i = 0; i < 100; i++ ){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    rw.get();
                }
            }).start();
        }

    }


}

class TestReadWriterLock {
    private int number = 0;

    private ReadWriteLock lock = new ReentrantReadWriteLock();


    public void get(){
        lock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + ":" + number);
        }finally {
            lock.readLock().unlock();
        }
    }

    public void set(int number){
        lock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() +":" + number);
            this.number = number;
        }finally {
            lock.writeLock().unlock();
        }
    }
}