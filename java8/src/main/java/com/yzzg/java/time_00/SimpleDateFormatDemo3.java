package com.yzzg.java.time_00;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = null;
        try {
            /**
             * java8 的使用 LocalDate
             */
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
            DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE;

            Callable<LocalDate> task = new Callable<LocalDate>() {
                @Override
                public LocalDate call() throws Exception {
                    return LocalDate.parse("20200923",dtf);
                }
            };
            pool = Executors.newFixedThreadPool(10);
            List<Future<LocalDate>> retures = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                Future<LocalDate> data = pool.submit(task);
                retures.add(data);
            }

            System.out.println("----------------------------");

            for (Future<LocalDate> f : retures) {
                System.out.println(f.get());
            }

        }finally {
            pool.shutdown();
        }


    }
}
