package com.yzzg.biz.socket_tcp_05;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerUpgradDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端的Socket对象
        ServerSocket  ss = new ServerSocket(6666);
        // 监听客户端 连接
        Socket s = ss.accept();
        // 包装客户端连接通道中的流
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("e:copy.java"));

        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();  // 读取一行后换行
            bw.flush();
        }

        // 给客户端反馈信息
        BufferedWriter bwserver = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwserver.write("文件上传成功");
        bw.newLine();
        bw.flush();

        // br.close();
        bw.close();
        s.close();


    }
}
