package com.yzzg.java.nio_00;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class NioDemo {
    public static void main(String[] args) {
        test0();

    }



    public static void test0() {
        //1.分配一个指定大小的缓冲区
        ByteBuffer buf = ByteBuffer.allocate(1024);
        System.out.println(buf.capacity());
        System.out.println(buf.limit());
        System.out.println(buf.position());
        System.out.println("================================");
        String str = "abcd";
        // 2.利用put 存入数据
        buf.put(str.getBytes());

        System.out.println(buf.capacity());
        System.out.println(buf.limit());
        System.out.println(buf.position());
        System.out.println("------------flip-------------------------");
        // 3.flip() 读取模式
        buf.flip();

        System.out.println(buf.capacity());
        System.out.println(buf.limit());
        System.out.println(buf.position());

        // 4.get 读取数据
        byte[] bytes = new byte[buf.limit()];
        buf.get(bytes);
        System.out.println(new String(bytes,0, bytes.length));
        System.out.println("--------------get-----------------------");
        System.out.println(buf.capacity());
        System.out.println(buf.limit());
        System.out.println(buf.position());

        // 5.rewind 模式 ，可重复读
        buf.rewind();
        System.out.println("---------------rewind()-------------");
        System.out.println(buf.capacity());
        System.out.println(buf.limit());
        System.out.println(buf.position());

        // 6.clear :清空缓冲区，但是缓冲区数据还在，但是数据处于“被遗忘”状态, 原来三个位置标记 复原
        buf.clear();
        System.out.println("---------------clear()-------------");
        System.out.println(buf.capacity());
        System.out.println(buf.limit());
        System.out.println(buf.position());
        // mark:标记，表示记录当前position的位置，可以通过reset() 恢复到mark()的位置

        //  0 <= mark <= position <= limit <= capacity

        // buf.hasRemaining() 判断缓冲区中的数据是否还有可操作的数据
        if (buf.hasRemaining()) {

        }



    }
}
