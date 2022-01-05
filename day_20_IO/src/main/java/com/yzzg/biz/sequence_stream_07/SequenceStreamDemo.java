package com.yzzg.biz.sequence_stream_07;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/**
 * 序列流 也叫序列读取流  因为 序列流只有 序列读取流 没有序列输出流
 */
public class SequenceStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\partFiles");
        mergeFile(file);
        return;

    }

    private static void mergeFile(File pathsDir) throws IOException {
        // 使用序列读取流 合并 被切割的媒体文件
        List<FileInputStream> list = new ArrayList<>();
        for(int i = 1; i < 7; i++) {
            list.add(new FileInputStream(new File(pathsDir, i + ".part")));
        }

        // 怎么获取枚举对象呢？ list对象自身是无法获取枚举对手，考虑Collections中看是否存在
        Enumeration<FileInputStream> en = Collections.enumeration(list);

        // 源  创建序列流对象
        SequenceInputStream sis = new SequenceInputStream(en);

        // 目的地
        FileOutputStream fos = new FileOutputStream(new File(pathsDir, "0.mp3"));

        // 定义写出缓冲区
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = sis.read(bytes)) != -1){
            // 写出
            fos.write(bytes);
        }

        // 关闭流资源
        sis.close();
        fos.close();
    }
}
