package com.yzzg.biz.socket_udp_05;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiveUpgradDemo {
    public static void main(String[] args) throws IOException {
        // 创建一个接收端socket
        DatagramSocket ds = new DatagramSocket(10086);

        // 创建一个数据报文包 DatagramPacket容器
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        // 读取数据到缓冲池中
        ds.receive(dp);

        // 获取IP 解析对象
        String ip = dp.getAddress().getHostAddress();

        // 解析数据 并打印到控制台
        String baowen = new String(dp.getData(), 0, dp.getLength());
        System.out.println(baowen);
    }
}
