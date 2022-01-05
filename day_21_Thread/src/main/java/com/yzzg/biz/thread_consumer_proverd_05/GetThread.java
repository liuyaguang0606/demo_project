package com.yzzg.biz.thread_consumer_proverd_05;

public class GetThread implements Runnable {
    private Student s;


    GetThread(Student s){
        this.s = s;
    }

    @Override
    public void run() {
        System.out.println(s.name + "==" + s.age);
    }
}
