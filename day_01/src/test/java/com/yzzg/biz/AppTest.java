package com.yzzg.biz;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        Dea d1 = new Dea(true);
        Thread t1 = new Thread(d1);
        t1.start();

        Dea d2 = new Dea(false);
        Thread t2 = new Thread(d2);
        t2.start();

    }



    class Dea implements Runnable{

        private boolean flage;

        public Dea(boolean flage){
            this.flage = flage;
        }

        @Override
        public void run() {

            if (flage) {
                synchronized (LockObject.objA) {
                    System.out.println("if  objA");
                    synchronized (LockObject.objB){
                        System.out.println("if objB");
                    }
                }

            }else {
                synchronized (LockObject.objB) {
                    System.out.println("else objb");
                    synchronized (LockObject.objA) {
                        System.out.println("else objA");
                    }
                }

            }

        }
    }

}
