package com.yzzg.biz.set_linkedHastSet_02;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet: 底层数据结构是 链表 + 哈希表组成
 * 哈希表 ：保证元素唯一
 * 链表： 保证元素有序。（存入/取出是一致）
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet<String>();

        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("java");

        for (String s : hs){
            System.out.println(s);
        }





    }

}
