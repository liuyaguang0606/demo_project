package com.yzzg.biz.consumerprovide;

import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

public class Dddd {
    public static void main(String[] args) {

        Resource res = new Resource();
        SetThread s = new SetThread(res);

        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);

        t1.start();
        t2.start();

    }
}

class SetThread implements Runnable{

    private Resource res;

    public SetThread(Resource res) {
        this.res = res;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "=++++++++++");
        }
    }
}

class Resource {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
