package com.yzzg.biz.timer_upgrade_08;


import java.util.Timer;

/**
 * 定时器
 */
public class MyTimerDemo {
    public static void main(String[] args) {
        // 1、创建定时器 timer
        Timer timer = new Timer();

        // 2、执行任务 // 连环炸弹
        timer.schedule(new MyTimerTask(), 3000 , 2000);
    }
}
