package com.yzzg.biz.thread_runnable_02;

public class TicketRunnable implements Runnable {

    private int ticket=100;

    @Override
    public void run() {
        while (true){
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + ":" +"正在出售第"+ (ticket--) + "张票");
            }
        }
    }
}
