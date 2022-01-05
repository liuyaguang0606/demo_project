package com.yzzg.biz.thread_dead_lock_04;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class DieLockDemo {
    public static void main(String[] args) {
        DieLock d1 = new DieLock(true);
        DieLock d2 = new DieLock(false);

        d1.start();
        d2.start();


    }
}
