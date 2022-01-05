package com.yzzg.biz.timer_upgrade_08;

import java.util.TimerTask;

public class MyTimerTask  extends TimerTask {
    @Override
    public void run() {
        System.out.println("bang, bang, bang 爆炸@");
    }
}
