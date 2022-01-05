package com.yzzg.java.nio_00;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TestChannelDemo {
    public static void main(String[] args) throws IOException {



    }

    /**
     * 通道之间的数据传输（直接缓冲区）
     * @throws IOException
     */
    public static void test03() throws IOException {
        FileChannel inChannel = FileChannel.open(Paths.get("d://1.jpg"), StandardOpenOption.READ);
        FileChannel outChannel = FileChannel.open(Paths.get("d://2.jpg"), StandardOpenOption.READ, StandardOpenOption.WRITE);
        //inChannel.transferTo(0, inChannel.size(), outChannel);
        // 同下
        outChannel.transferFrom(inChannel, 0,inChannel.size());

        inChannel.close();
        outChannel.close();
    }


    /**
     * 使用直接缓冲区对文件的复制 （内存映射文件）
     * @throws IOException
     */
    public static void test02() throws IOException {
        // 1、创建通道
        FileChannel inChannel = FileChannel.open(Paths.get("d://1.jpg"), StandardOpenOption.READ);
        FileChannel outChannel = FileChannel.open(Paths.get("d://2.jpg"), StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE);

        // 2、物理内存映射文件
        MappedByteBuffer inMappedbuf = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, inChannel.size());
        MappedByteBuffer outMappedbuf = outChannel.map(FileChannel.MapMode.READ_WRITE, 0, inChannel.size());

        // 3.直接对缓冲区数据操作
        byte[] dst = new byte[inMappedbuf.limit()];
        inMappedbuf.get(dst);
        outMappedbuf.put(dst);

        inChannel.close();
        outChannel.close();





    }


    /**
     * 利用通道直接完成文件复制 （非直接缓冲区）
     * @throws IOException
     */
    public static void test01() throws IOException {
        // 创建流 ，获取通道
        FileInputStream fis = new FileInputStream("1.jpg");
        FileOutputStream fos = new FileOutputStream("2.jpg");

        // 1、获取通道
        FileChannel inChannel = fis.getChannel();
        FileChannel outChannel = fos.getChannel();

        // 2、自定义 分配指定大小的本地缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        // 3、基于流
        while (inChannel.read(buffer) != -1) {
            // 将缓冲区写模式，通过flip()切换到读模式
            buffer.flip();
            outChannel.write(buffer);
            // 清除各种标记，可以理解为将 缓冲区复原，包括恢复到写模式
            buffer.clear();

        }

        // 4、关闭通道 和 流
        try {
            inChannel.close();
            outChannel.close();
            fis.close();
            fos.close();
        } catch (Exception e) {


        }finally {

        }


    }

}
