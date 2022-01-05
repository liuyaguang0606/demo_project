package com.yzzg.biz.memory_stream_05;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * io 不仅可以写到硬盘文件、还可以写到内存中
 * 没用调用系统底层资源
 *
 */
public class ByteArrayStreamDemo {
    public static void main(String[] args) throws IOException {
        // 1、
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write("nihao write memory".getBytes());
        String str = baos.toString();
        System.out.println(str);
        // 2、从堆内存中 获取
        byte[] bytes = baos.toByteArray();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

        // 3、定义一个接收缓存容器
        byte[] b = new byte[1024];
        int len = 0;
        while ((len = bais.read(b)) != -1) {
            System.out.println("b:" + new String(b, 0, len) + "\nlen : " + len);
        }

        baos.close();
        bais.close();
    }
}
