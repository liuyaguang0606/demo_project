package com.yzzg.biz.consumerprovide;

public class Consumer implements Runnable {

    private Student  s;
    public Consumer(Student s) {
        this.s = s;
    }


    @Override
    public void run() {
        System.out.println("消费：" + s.getName() + "" + s.getAge());
    }

}
