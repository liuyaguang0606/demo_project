package com.yzzg.biz.data_io_stream_10;

import java.io.*;

public class DataInputStreamDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 1、创建一个字节输入流
//        String pathName = "F:\\demo.txt";
//        FileInputStream fis = new FileInputStream(new File(pathName));
//        DataInputStream dis = new DataInputStream(fis);

        FileOutputStream fis = new FileOutputStream(new File("F:\\test_01.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(fis);
        // DataOutputStream 对象是一个写出数据到文件，能保持字节数不变对象
        DataOutputStream dos = new DataOutputStream(bos);
        dos.write(97);
        dos.writeDouble(12.25D);
        dos.flush();
        dos.close();


    }
}
