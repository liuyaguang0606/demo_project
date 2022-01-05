package com.yzzg.java.lambda_04_forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class ForkJoinCalculateDemo {
    public static void main(String[] args) {
        ForkJoinTask<Long> fork = new ForkJoinCalculate(0L, 15L);
        ForkJoinPool pool = new ForkJoinPool();
        Long sum = pool.invoke(fork);
        System.out.println(sum);
    }
}
