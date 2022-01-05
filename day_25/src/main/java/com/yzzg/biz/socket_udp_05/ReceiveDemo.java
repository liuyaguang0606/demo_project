package com.yzzg.biz.socket_udp_05;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        // 创建一个接收数据的socket对象  并监听端口10086
        DatagramSocket ds = new DatagramSocket(10086);

        // 创建一个数据报文容器 也就是数据报包
            // 创建一个数据报 包
        byte[] bytes = new byte[1024];
        int len = bytes.length;
        DatagramPacket dp = new DatagramPacket(bytes,len);
        // 将数据读取到数据报包对象容器中
        ds.receive(dp);
        // 获取IP相关数据已经主机相关数据
        InetAddress ia = dp.getAddress();
        String hostName = ia.getHostName();
        String ip = ia.getHostAddress();

        // 获取数据缓冲区的数据 包括真实容量大小
        byte[] bytes1 = dp.getData();
        int length = dp.getLength();
        String baowen = new String(bytes1,0,length);

        System.out.println(ip + ": 传递的数据是 :" + baowen);





    }
}
