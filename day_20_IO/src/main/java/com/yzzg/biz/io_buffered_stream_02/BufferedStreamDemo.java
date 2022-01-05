package com.yzzg.biz.io_buffered_stream_02;

import java.io.*;

public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {

        //1
        ByteArrayOutputStream baos = new ByteArrayOutputStream(1024);
        PrintStream ps = new PrintStream(baos);
        ps.print(new char[]{'b','c','d'});
        ps.print("\n");
        ps.print(23.23D);
        ps.print("\n");
        ps.println(new Student("zhangSan", 22));
        ps.flush();

        // 2内存输入流 对应
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        // 缓冲池
         byte[] bytes = new byte[1024];
        // 增强输入流对象
        BufferedInputStream bis = new BufferedInputStream(bais);
        int len = 0;
        while ((len = bis.read(bytes)) != -1){
            System.out.println(new String(bytes, 0, len));
        }

        ps.close();
        baos.close();
        bais.close();
    }
}
