package com.yzzg.biz.callable_upgrade_05;


import java.util.concurrent.Callable;

/***
 * 有这样一个需求：
 *      有多个线程 分别计算一个求和运算，并分别获取计算结果
 */
public class MyCallable implements Callable<Integer> {

    private Integer number;

    public MyCallable(){}

    public MyCallable(int number){
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= number; i++){
            sum +=i;
        }
        return sum;
    }
}
