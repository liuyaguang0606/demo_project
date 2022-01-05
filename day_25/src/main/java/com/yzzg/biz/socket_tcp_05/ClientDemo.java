package com.yzzg.biz.socket_tcp_05;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * tcp 协议发送数据：
 * 1、 创建发送端socket客户端对象
 *      这一步如果成功，就说明链接已经建立成功
 * 2、通过socket 建立链接之后 ，获取socket通道的输出流
 * 3、发送数据，释放资源
 *
 * 注意 tcp协议 必须先开启服务器端
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        // 创建socket 客户端对象 , 要指明要连接的服务器地址 以及端口号
        Socket socket = new Socket("192.168.137.1", 8888);

        // 获取socket 通道输出流
        OutputStream os = socket.getOutputStream();
        os.write("你好 tcp客户端连接对象".getBytes());

        System.out.println("===============");
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String str = new String(bytes, 0, len);
        System.out.println(str);
    }
}
