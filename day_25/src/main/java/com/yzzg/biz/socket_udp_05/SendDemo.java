package com.yzzg.biz.socket_udp_05;

import java.io.IOException;
import java.net.*;

/**
 * udp 协议客户端
 * 1、创建发送端socket对象
 * 2、创建数据，并把数据打包
 * 3、调用socket对象的发送方法 发送数据
 * 4、关闭资源
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        // 1、udp协议客户端发送对象DatagramSocket
        DatagramSocket ds = new DatagramSocket();
        // 2、创建要发送的数据报文 并打成包
            // 创建数据
        byte[] bytes = "hello,udp 我来了".getBytes();
            //  数据长度
        int length = bytes.length;
            // InetAddress
        InetAddress ia = InetAddress.getByName("192.168.1.6");
            // 端口号
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bytes, length, ia, port);
        ds.send(dp);

        ds.close();

    }
}
