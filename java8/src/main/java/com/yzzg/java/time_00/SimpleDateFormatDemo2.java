package com.yzzg.java.time_00;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

            Callable<Date> task = new Callable<Date>() {
                @Override
                public Date call() throws Exception {
                    return DateFormatThreadLocalUtils.convert("20200922");
                }
            };
            pool = Executors.newFixedThreadPool(10);
            List<Future<Date>> retures = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                Future<Date> data = pool.submit(task);
                retures.add(data);
            }

            System.out.println("----------------------------");

            for (Future<Date> f : retures) {
                System.out.println(f.get());
            }

        }finally {
            pool.shutdown();
        }


    }
}
