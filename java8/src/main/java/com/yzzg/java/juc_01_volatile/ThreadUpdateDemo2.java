package com.yzzg.java.juc_01_volatile;

public class ThreadUpdateDemo2 implements Runnable {

    private volatile int serialNumber = 0;

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(getSerialNumber());
    }

    private int getSerialNumber(){
        return serialNumber++;
    }

}
