package com.yzzg.biz.socket_udp_02;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP 接收报文端
 * 1、接收
 */
public class ReceiveDemo {

    public static void main(String[] args) throws Exception {
        //1、创建udp socket接收端
        DatagramSocket ds = new DatagramSocket(10086);
        //2、创建数据缓存池
        byte[] bytes = new byte[1024];
        int length = bytes.length;
        //3将数据接收到数据包中
        DatagramPacket dp = new DatagramPacket(bytes, length);
        // 调用socket 对象的方法接收数据
        ds.receive(dp);   //  阻塞式方法   下面close方法关闭

        // 4、解析数据包数据
        InetAddress address = dp.getAddress();
        String ip = address.getHostAddress();
        byte[] bys2 = dp.getData();
        int len = dp.getLength();
        String s = new String(bys2, 0, len);
        System.out.println(ip + "传递的数据是：" + s);
        // 关闭数据资源
        ds.close();

    }
}
