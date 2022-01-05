package com.yzzg.biz.timer_07;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
    private Timer timer;

    public MyTimerTask(){}

    public MyTimerTask(Timer timer){
        this.timer = timer;
    }

    @Override
    public void run() {
        System.out.println("bang, bang, bang ,爆炸！！");

        // 爆炸完 使用 外部通过构造方法传入定时器 用来关闭阻塞调度任务 ，可以不调用cancel方法 就是每隔5秒执行一次
        timer.cancel();
    }
}
