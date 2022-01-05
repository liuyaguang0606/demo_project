package com.yzzg.biz.socket_tcp_03;


import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * tcp协议接收数据
 * 1、创建接收端socket对象
 * 2、监听客户端链接，返回一个对应的socket对象
 * 3、获取输入流 读取数据
 * 4、释放资源
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        // 创建接收端socket对象
        ServerSocket ss = new ServerSocket(8888);
        // 监听客户端链接，返回一个对应的socket 对象
        Socket  s = ss.accept();  // 阻塞式方式
        // 获取输入流对象
        InputStream is = s.getInputStream();
        //创建一个接收数据 缓冲区
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String sss = new String(bytes, 0, len);
        System.out.println(sss);

        //关闭客户端链接
        s.close();

    }
}
