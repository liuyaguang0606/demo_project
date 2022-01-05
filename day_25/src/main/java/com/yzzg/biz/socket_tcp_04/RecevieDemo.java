package com.yzzg.biz.socket_tcp_04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class RecevieDemo {
    public static void main(String[] args) throws IOException {
        // 创建服务端
        ServerSocket ss = new ServerSocket(9999);
        // 监听客户端链接
        Socket s = ss.accept();
        // 获取输入流 接收客户端数据流
        InputStream is = s.getInputStream();
        //读取到缓冲区
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String str = new String(bytes, 0, len);
        System.out.println(str);

        // 往客户端写数据
        OutputStream os = s.getOutputStream();
        os.write("已经收到数据".getBytes());

        //
        s.close();
        ss.close();
    }
}
