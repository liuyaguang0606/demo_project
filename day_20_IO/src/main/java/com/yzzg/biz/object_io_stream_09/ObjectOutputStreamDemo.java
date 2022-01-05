package com.yzzg.biz.object_io_stream_09;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("F:\\00.txt")));
        oos.writeObject(new Student("lisi", 20));

        oos.close();
    }
}
