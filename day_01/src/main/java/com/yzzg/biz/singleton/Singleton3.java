package com.yzzg.biz.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Singleton3 {

    public static Singleton3 INSTANCE;
    private String info;

    static {
        Properties pro = new Properties();
        try {
            ClassLoader cl = Singleton3.class.getClassLoader();
            InputStream is = cl.getResourceAsStream("day_01/src/single.properties");
            pro.load(is);
            INSTANCE = new Singleton3(pro.getProperty("info"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private Singleton3(String info){
        this.info = info;
    }
}
