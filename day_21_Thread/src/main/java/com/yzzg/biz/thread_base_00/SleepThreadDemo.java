package com.yzzg.biz.thread_base_00;

public class SleepThreadDemo {
  /**
   * sleep 应用 防止线程占用100%
   */

  public static void main(String[] args) {
    new Thread("t1") {
      @Override
      public void run() {
        while (true) {
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }

      }
    };


  }


}
