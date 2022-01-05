package com.yzzg.biz.singleton;

public class TestSingleton {
    public static void main(String[] args) {
//        test1();
//        test2();
        test3();


    }


    public static void test3() {
        for (int i = 0; i < 5; i++) {

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Singleton3 singleton3 = Singleton3.INSTANCE;
                    System.out.println(singleton3.hashCode());

                }
            }).start();
        }
    }

        public static void test2() {
            for (int i = 0; i < 5; i++) {

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        Singleton2 singleton2 = Singleton2.INSTANCE;
                        System.out.println(singleton2.hashCode());

                    }
                }).start();
            }
        }

        public static void test1() {
            for (int i = 0; i < 3; i++) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Singleton1.INSTANCE);
                    }
                }).start();
            }
        }
}
