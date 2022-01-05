package com.yzzg.biz.thread_consumer_proverd_05;

public class SetThread implements Runnable {

    private Student s;
    SetThread (Student s) {
        this.s = s;
    }

    private int i = 0;
    @Override
    public void run() {
        if (i%2 == 0) {
            s.name = "张三";
            s.age = 10;
        }else {
            s.name = "李四";
            s.age = 60;
        }
    }
}
