package com.yzzg.biz.socket_tcp_03;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * TCP 协议发送数据
 *  1、创建发送端socket对象
 *  2、获取输出流 写数据
 *  3、关闭资源
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        // tcp 套接字对象socket
        // Socket(InetAddress address, int port)
        // Socket(String host, int port)
        // Socket s = new Socket(InetAddress.getByName("192.168.1.3"), 8888);
        Socket s = new Socket("192.168.1.3", 8888);

        // 获取套接字对象的输出流
        OutputStream os = s.getOutputStream();
        os.write("tcp: helloworld".getBytes());

        s.close();

    }

}
