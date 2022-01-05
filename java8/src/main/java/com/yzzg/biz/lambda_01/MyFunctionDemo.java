package com.yzzg.biz.lambda_01;

public class MyFunctionDemo {
    public static void main(String[] args) {

        /**
         * 需求：
         * 1、将传进去的字符串 去除头和尾空格
         * 2、将字符串 转换成大写
         */

        String strs = stringHandle("  qwertyuiop  ", (str) -> {
            return str.trim();
        });
        System.out.println(strs);
        System.out.println("===========================");
        String s = stringHandle("asdfghjkl", str -> str.toUpperCase());
        System.out.println(s);
        System.out.println("---------------------------");
//        String ss = stringHandle("12445",  (x) -> {System.out::println()
//        });
    }


    public static <T> T stringHandle(String str, MyFunction my) {
        return (T) my.getValue(str);
    }
}
