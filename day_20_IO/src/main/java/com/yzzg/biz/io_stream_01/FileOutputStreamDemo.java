package com.yzzg.biz.io_stream_01;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //
        FileOutputStream fos = new FileOutputStream("fos.txt");
        for (int i = 0; i <= 10; i++) {
            fos.write(("hello"+ i).getBytes());
        }
        fos.close();
    }
}
