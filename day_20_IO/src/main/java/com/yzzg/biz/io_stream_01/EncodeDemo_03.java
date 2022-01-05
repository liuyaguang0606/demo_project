package com.yzzg.biz.io_stream_01;

import java.io.UnsupportedEncodingException;

public class EncodeDemo_03 {
    public static void main(String[] args) throws UnsupportedEncodingException {

        byte[] bytes = "!@#$%^".getBytes("utf-8");
        for (byte b : bytes) {
            System.out.println(b);
        }

    }
}
