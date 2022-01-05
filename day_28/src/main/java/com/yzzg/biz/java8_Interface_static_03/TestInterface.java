package com.yzzg.biz.java8_Interface_static_03;

public interface TestInterface {
    default void sameMethod(){
        System.out.println("interface  default sameMethod...");
    }

    public static void staticMethod(){
        System.out.println("interface  static method  ...");
    }


}
