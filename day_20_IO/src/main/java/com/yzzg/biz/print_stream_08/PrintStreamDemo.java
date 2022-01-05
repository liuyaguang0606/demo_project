package com.yzzg.biz.print_stream_08;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 打印流 只有输出流
 * 功能： 将流输出到控制台
 *
 */
public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {

        // 使用往内存写入流，可以临时写入到内存中
        ByteArrayOutputStream baos = new ByteArrayOutputStream(1024);
        // 使用打印流  可以打印各种数据类型数据 包括基础数据 对象等
        PrintStream ps = new PrintStream(baos);  // 打印输出默认到控制台 ，但是这里接入了内存输出流ByteArrayOutputStream 写入到内存
        ps.print("你好，输出打印流！！");
        ps.print(false);
        ps.print(10);
        ps.print('a');
        ps.print(12.1);
        ps.print(12.02D);
        ps.print(new Student());
        ps.print(new char[]{'a','b'});
        ps.flush();   // 刷入到ByteArrayOutputStream内存流中 暂存内存中

        // 使用内存输入流读取
        // 将ByteArrayOutputStream刷入到内存流中数据取出
        // byte[] bytes = baos.toByteArray();
        // ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        // 简写
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());

        // 定义一个 读取流暂存缓存池
        byte[] by = new byte[1024];
        int len = bais.read(by);
        System.out.println(new String(by, 0, len));
    }
}
