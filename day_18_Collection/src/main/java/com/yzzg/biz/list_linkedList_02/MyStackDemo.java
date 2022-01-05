package com.yzzg.biz.list_linkedList_02;

public class MyStackDemo {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.add("hello");
        ms.add("world");
        ms.add("java");

        System.out.println(ms.get());
        System.out.println(ms.get());
        System.out.println(ms.get());
    }
}
