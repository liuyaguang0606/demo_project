package com.yzzg.biz.thread_innerClass_06;

/**
 * 开启线程有很多方式
 *      1、thread 匿名内部类开启方式
 *      2、runnable 匿名内部类开启方式
 *
 *      匿名内部类格式：
 *          new 类名/接口名() {
 *          }
 *      其本质：是类/接口的子类   对象
 *
 */
public class ThreadInnerClassDemo {

    public static void main(String[] args) {

        // Thread 匿名内部类实现方式
        new Thread("thread-innerClass"){
            @Override
            public void run() {
                for (int i=0; i<100; i++){
                    System.out.println(Thread.currentThread().getName()+ ":" +i);
                }
            }
        }.start();
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


        // Runnable 匿名内部类实现方式,,注意作为 thread 构造参数， {} 无任何结构
        new Thread( new Runnable() {
                    @Override
                    public void run() {
                        for (int i=0; i<100; i++){
                            System.out.println(Thread.currentThread().getName()+ ":" +i);
                        }
                    }
                }, "Runnable-innerClass"
        ){}.start();




        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        /**
         * 更有难道的面试题 开发不会遇到
         * 1、会不会报错？  不会
         * 2、会执行那里的代码 ？  执行 子类对象的run方法
         */

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<100; i++){
                    System.out.println("实现runnable接口覆写run方法" + Thread.currentThread().getName()+ ":" +i);
                }
            }


        }){

            @Override
            public void run() {
                for (int i=0; i<100; i++){
                    System.out.println("继承Threade类覆写run方法" + Thread.currentThread().getName()+ ":" +i);
                }
            }

        }.start();
    }


}
