package com.yzzg.biz.consumerprovide;

public class Demo {
    public static void main(String[] args) {
        Student s = new Student();

        Consumer con = new Consumer(s);
        Provider pro = new Provider(s);

        Thread cont1 = new Thread(con);
        Thread prot1 = new Thread(pro);

        cont1.start();
        prot1.start();

    }
}
