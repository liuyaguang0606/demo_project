package com.yzzg.biz.thread_01;

/**
 * 消费者 接收学生 / 安排学生住宿
 */
public class ConsumerThread implements Runnable{
    private StudentResource s;
    public ConsumerThread(StudentResource s){
        this.s = s;
    }


    @Override
    public void run() {
        while (true) {
            synchronized(s) {
                // 判断是否有数据（是否已经登记完毕，登记完毕 消费者接入校区安排）
                if (!s.isFlage()){
                    try {
                        s.wait();   // wait 等待 立即释放锁，当醒来时从此处执行
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(s.getName() + ":" + s.getAge());

                // 改变标记
                s.setFlage(false);
                // 唤醒对方
                s.notify();
            }
        }
    }
}
