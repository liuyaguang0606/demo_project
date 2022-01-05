package com.yzzg.biz.timer_07;

import java.util.Timer;

public class TimerDemo {
    public static void main(String[] args) {
        // 创建一个定时器 timer
        Timer timer = new Timer();

        // 定时器 没延迟5秒 执行一次定时任务
        // 将定时器 传入 ，用于关闭定时器，可以不调用定时器的canned方法 ，就是每隔5秒执行一次；
        timer.schedule(new MyTimerTask(timer), 5000);

    }
}
