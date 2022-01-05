package com.yzzg.biz.socket_udp_02;

import java.io.IOException;
import java.net.*;

/**
 * UDP 协议 发送数据
 * 1、创建socket
 * 2、创建数据包
 * 3、发送数据报包
 * 4、关闭资源
 */
public class SendDemo {

    public static void main(String[] args) throws IOException {
        //1、创建socket 对象
        DatagramSocket ds = new DatagramSocket();

        //2、创建数据 并把数据打包
        // DatagramPacket();
        byte[] bytes = "halelel".getBytes();
        //3、数据长度
        int length = bytes.length;
        //4、ip 地址对象
        InetAddress address = InetAddress.getByName("127.0.0.1");
        //5、定义端口
        int port = 10086;
        //6、封装数据包
        DatagramPacket dp = new DatagramPacket(bytes, length, address, port);

        //7、 调用socket 发送方法 发送数据
        ds.send(dp);

        // 关闭资源
        ds.close();
    }

}
