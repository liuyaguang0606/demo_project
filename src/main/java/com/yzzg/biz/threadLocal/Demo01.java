package com.yzzg.biz.threadLocal;

public class Demo01 {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static void main(String[] args) {
        final Demo01 d = new Demo01();

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    d.setContent(Thread.currentThread().getName() + "的数据");
                    System.out.println("-----------------");
                    System.out.println(Thread.currentThread().getName() + "--->" + d.getContent());
                }
            });
            thread.setName("线程" + i);
            thread.start();

        }
    }
}
