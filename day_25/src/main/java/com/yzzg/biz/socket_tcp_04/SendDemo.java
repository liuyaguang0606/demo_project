package com.yzzg.biz.socket_tcp_04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        // 创建发送端socket
        Socket s = new Socket("192.168.1.3",9999);

        //获取输出流
        OutputStream os = s.getOutputStream();
        os.write("发送到服务端".getBytes());

        // 接收服务器端数据
        InputStream is = s.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String str = new String(bytes,0, len);
        System.out.println(str);

        //
        s.close();

    }
}
