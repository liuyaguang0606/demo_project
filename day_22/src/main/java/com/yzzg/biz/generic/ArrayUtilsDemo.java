package com.yzzg.biz.generic;

public class ArrayUtilsDemo {


    public static void main(String[] args) {
        String str = ArrayUtilsDemo.<String>getMiddle("aaa","bbb","ccc","ddd");
        System.out.println(str);
    }

    public static <T> T getMiddle(T... a){
        return a[a.length/2];
    }

    public static <T> T getMax(T... a){
        T[] arr = a;
        StringBuffer sb = new StringBuffer();
        for (T t : arr) {
            sb.append(t).append(",");
        }
        T str = (T) sb.toString();
        return str;
    }


}
