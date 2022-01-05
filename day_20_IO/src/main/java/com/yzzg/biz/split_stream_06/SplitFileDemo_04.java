package com.yzzg.biz.split_stream_06;

import java.io.*;

/**
 * 将一个文件（文本文件、媒体文件等） 通过Io流 操作
 *  1、切割 成多个碎片 、或者叫（分卷压缩）
 *  2、切割后 不再是文件
 */
public class SplitFileDemo_04 {


    private static final int BUFFER_SIZE = 1048576;

    public static void main(String[] args) throws IOException {
        // 原理就是 读取一个文件或者媒体视频文件到内存 然后按照文件大小遍历 写出压缩文件碎片到盘符
        File srcFile = new File("F:\\jdk5.avi");
        File partsDir = new File("F:\\temp");
        splitFile(srcFile, partsDir);
    }

    private static void splitFile(File srcFile, File partsDir) throws IOException {
        if (!(srcFile.exists() && srcFile.isFile())) {
            throw new RuntimeException("源文件不是正确文件或者不存在");
        }
        if (!partsDir.exists()) {
            partsDir.mkdirs();
        }
        // 使用 字节输入流关联碎片文件
        FileInputStream fis = new FileInputStream(srcFile);
        // 明确目的 目的输出流有多个，只创建引用
        FileOutputStream fos = null;

        // 定义一个文件碎片缓冲区 大小1M
        byte[] bytes = new byte[BUFFER_SIZE];   // 1024*1024
        int len = 0;
        int count = 1;
        while ((len = fis.read(bytes)) != -1) {
            // 创建输出流对象，只要满足缓冲区大小，碎片数据确定，直接往碎片数据写数据
            // 碎片文件存储到partdir中
            fos = new FileOutputStream(new File(partsDir, count++ + ".part"));
            // 将缓冲区数据 写到碎片文件中
            fos.write(bytes, 0, len);
            // 直接关闭输出流
            fos.close();
        }

        // 分割完毕 关闭输入流
        fis.close();
    }
}
