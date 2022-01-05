package com.yzzg.biz.io_stream_01;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/src/fis.txt");
        int a = fis.read();
        System.out.println("a:" + a);

        int b = fis.read();
        System.out.println("b:" + b);

        int c = fis.read();
        System.out.println("c:" + c);

        int d = fis.read();
        System.out.println("d:" + d);

    }
}
