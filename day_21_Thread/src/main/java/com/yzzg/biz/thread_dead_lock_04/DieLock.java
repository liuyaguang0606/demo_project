package com.yzzg.biz.thread_dead_lock_04;

public class DieLock extends Thread {

    private boolean flage;

    DieLock(boolean flage) {
        this.flage = flage;
    }
    @Override
    public void run() {
        if (flage){
            synchronized (MyLock.objA) {
                System.out.println("if objA");
                synchronized (MyLock.objB){
                    System.out.println("if objB");
                }
            }
        }else {
            synchronized (MyLock.objB) {
                System.out.println("else objB");
                synchronized (MyLock.objA){
                    System.out.println("else objA");
                }
            }
        }

    }
}
