package com.yzzg.biz.socket_tcp_05;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * tcp协议接收数据
 * 1、创建服务器端socket对象
 * 2、监听每个客户端的请求并将 对应的客户端socket对象 返回
 * 3、获取客户端的输入流
 *
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        // 1、创建服务器端socket对象
        ServerSocket ss = new ServerSocket(8888);
        // 2、监听客户端连接 并拿到客户端对象
        Socket s = ss.accept();
        // 3、拿到客户端对象
        InputStream is = s.getInputStream();
        // 4、读取数据到缓冲池中, 并解析
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        // 5、打印到控制台
        String str = new String(bytes, 0, len);
        System.out.println(str);

        InetAddress ia = s.getInetAddress();
        System.out.println(ia.getHostAddress());
        System.out.println("===============");
        OutputStream os = s.getOutputStream();
        os.write("数据已经收到".getBytes());
        s.close();

    }
}
