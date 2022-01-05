package com.yzzg.java.time_00;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

            Callable<Data> task = new Callable<Data>() {
                @Override
                public Data call() throws Exception {
                    return (Data) sdf.parse("20200922");
                }
            };
            pool = Executors.newFixedThreadPool(10);
            List<Future<Data>> retures = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                Future<Data> data = pool.submit(task);
                retures.add(data);
            }

            System.out.println("----------------------------");

            for (Future<Data> f : retures) {
                System.out.println(f.get());
            }

        }finally {
            pool.shutdown();
        }


    }
}
