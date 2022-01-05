package com.yzzg.java.juc_01_volatile;

public class ThreadUpdateDemo implements Runnable {

    private volatile boolean flage = false;

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flage = true;
        System.out.println(Thread.currentThread().getName() + ":" + flage);

    }


    public boolean isFlage() {
        return flage;
    }

    public void setFlage(boolean flage) {
        this.flage = flage;
    }
}
