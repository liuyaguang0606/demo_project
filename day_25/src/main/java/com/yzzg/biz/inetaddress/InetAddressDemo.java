package com.yzzg.biz.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        // 查询api得知 为了方便操作ip地址 api封装了IP地址对象InetAddress
//        InetAddress id = InetAddress.getByName("LAPTOP-686UK2I6");
//        InetAddress id = InetAddress.getByName("192.168.1.6");
        InetAddress id = InetAddress.getLocalHost();
        // 获取本机主机名称
        String hostName = id.getHostName();
        System.out.println("hostName:" + hostName);
        // 获取本机计算机地址
        String hostAddress = id.getHostAddress();
        System.out.println("hostAddress:" + hostAddress);
        String canonical = id.getCanonicalHostName();
        System.out.println("canonicalhostname : " + canonical);


    }
}
