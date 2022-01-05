package com.yzzg.biz.object_io_stream_09;

import java.io.*;

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(new File("F:\\00.txt")));

        Student student = (Student) ois.readObject();
        System.out.println("student : " + student);
        ois.close();


    }
}
