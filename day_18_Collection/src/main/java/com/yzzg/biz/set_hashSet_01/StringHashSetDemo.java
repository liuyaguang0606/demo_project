package com.yzzg.biz.set_hashSet_01;

import java.util.HashSet;

/**
 * Hashset : 是可以保证自定义对象（元素）是唯一的 ， 存入/取出是无序的 ； 如何保证自定义元素的唯一性？
 * 1、hashset 底层是基于hashMap存取数据，所以底层是哈希表（哈希表：元素是链表的 数组结构）
 *
 *
 *  查看源码发现：
 *  2、添加功能底层主要依赖两个方法：
 *        int hashCode()  用于判断元素的哈希值是否相同
 *        boolean equals() 用于判断内容是否相同
 *
 *    步骤：
 *      首先判断hashCode()哈希值是否相同
 *          如果相同:   继续走，比较地址值或者equals()方法；
 *                  返回true：说明元素重复，就不添加
 *                  返回false：说明元素不重复，就添加到集合
 *          如果不同:   直接添加到hashMap集合中;
 *   String重写了hashCode()方法和equals()方法
 */
public class StringHashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("hello");

        for (String s : hs) {
            System.out.println(s);
        }

        /**
         * 打印：
         * world
         * java
         * hello
         */


    }
}
