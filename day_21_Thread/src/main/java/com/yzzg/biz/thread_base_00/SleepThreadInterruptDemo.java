package com.yzzg.biz.thread_base_00;

import java.util.concurrent.ConcurrentHashMap;

public class SleepThreadInterruptDemo {

  public static void main(String[] args) throws InterruptedException {

    Thread t = new Thread("t1") {
      @Override
      public void run() {
        System.out.println("enter  sleep ...");
        try {
          Thread.sleep(5000);
          // interrupt 抛出异常下面不会执行
          System.out.println("是否能执行 ....");
        } catch (InterruptedException e) {
          System.out.println("weak up ....");
          e.printStackTrace();
        }
      }
    };

    t.start();

    Thread.sleep(1000);
    System.out.println("interrupt ....");
    // 中断/打断线程t  使线程t 醒来，并清除标记
    t.interrupt();
    boolean interrupted1 = Thread.interrupted();

    System.out.println("interrupted1  :: +" + interrupted1);
    boolean interrupted = t.isInterrupted();
    System.out.println("interrupted  :: +" + interrupted);
    ConcurrentHashMap con = new ConcurrentHashMap();


  }

}
