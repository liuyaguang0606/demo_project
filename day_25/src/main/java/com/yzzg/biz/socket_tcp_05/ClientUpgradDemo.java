package com.yzzg.biz.socket_tcp_05;

import java.io.*;
import java.net.Socket;

public class ClientUpgradDemo {
    public static void main(String[] args) throws IOException {
        // 创建客户端socket对象
        Socket s = new Socket("192.168.137.1", 6666);
        // 使用字节流读取 ，然后将字节流转换成字符流，再然后对字符流增强
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 把socket 连接通道中的流 包装一下
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line = null;
        while ((line = br.readLine()) != null ) {
            if ("886".equals(line)) {
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
        s.close();

    }
}
