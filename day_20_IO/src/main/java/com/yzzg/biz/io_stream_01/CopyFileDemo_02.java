package com.yzzg.biz.io_stream_01;

import java.io.*;

public class CopyFileDemo_02 {
    public static void main(String[] args) throws IOException {
        // 1、首先确定源 和 目的 地址
        File sourceFile = new File("tempfile"+File.separator+"file.txt");
        File destFile = new File("tempfile\\copy_file.txt");
        if (!destFile.exists()) {
            destFile.createNewFile();
        }
        if (!sourceFile.exists()) {
            sourceFile.createNewFile();
        }

        // 2、明确输入流和源 相关联， 输出流和目的地 相关联；
        FileInputStream fis = new FileInputStream(sourceFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        // 3、定义一个缓冲区 字节数组
        byte[] buf = new byte[4];
        int len = 0;
        while ((len = fis.read(buf)) != -1){
            System.out.println("len : " + len);
            fos.write(buf, 0, len);
        }

        // 4、关闭流资源
        fis.close();
        fos.close();
    }
}
