package com.yzzg.biz.consumerprovide;

public class Provider implements Runnable {

    private Student s;

    Provider(Student s) {
        this.s = s;
    }


    @Override
    public void run() {
        s.setName("zhangSan");
        s.setAge(25);
        System.out.println("生产:");
    }
}
