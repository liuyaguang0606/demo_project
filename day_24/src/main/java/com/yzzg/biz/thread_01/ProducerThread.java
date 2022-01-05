package com.yzzg.biz.thread_01;

/**
 * 生产者 - 创建学习 / 招生学生
 */
public class ProducerThread implements Runnable{

    private StudentResource s;
    private int x = 0;

    public ProducerThread(StudentResource s){
        this.s = s;
    }


    @Override
    public void run() {
        while (true) {
            synchronized (s) {
                // 判断 生成者 /招生者是否等级完毕，登记完进入小区(家长不让进入)
                if (s.isFlage()) {
                    try {
                        s.wait();   // wait 等待 立即释放锁，当醒来时从此处执行
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (x % 2 == 0) {
                    s.setName("科比");
                    s.setAge(20);
                } else {
                    s.setName("姚明");
                    s.setAge(30);
                }
                x++;

                // 改变标记
                s.setFlage(true);
                // 唤醒对方 消费者
                s.notify();
            }
        }
    }
}
