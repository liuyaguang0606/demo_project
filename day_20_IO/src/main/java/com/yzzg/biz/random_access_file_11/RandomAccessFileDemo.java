package com.yzzg.biz.random_access_file_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        // RandomAccessFile raf = new RandomAccessFile(new File(new File("F:\\"),"raf.txt"), "rw");
        // rw  是一种模式 RandomAccessFile一个管道可以同时支持读写操作
        RandomAccessFile raf = new RandomAccessFile(new File("F:\\","raf.txt"), "rw");
        raf.write("nihao\nnihao\nnihao\nnihao\nnihao".getBytes());
        FileChannel fileChannel = raf.getChannel();

        Thread.sleep(3000);
        raf.seek(6);
        raf.write("ooxx".getBytes());
        Thread.sleep(3000);


    }
}
