package com.yzzg.biz.socket_udp_05;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class SendUpgradDemo {
    public static void main(String[] args) throws IOException {
        // 创建一个udp socket 对象
        DatagramSocket ds = new DatagramSocket();

        // 创建数据并 封装成数据报文 包
        byte[] bytes = "hello udp 数据代码优化后发送".getBytes();
        InetAddress ia = InetAddress.getByName("192.168.1.6");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, ia, port);

        // 发送数据报文 包
        ds.send(dp);

        // 关闭资源
        ds.close();
    }
}
