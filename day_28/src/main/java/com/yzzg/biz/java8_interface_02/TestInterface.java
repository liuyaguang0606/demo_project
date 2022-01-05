package com.yzzg.biz.java8_interface_02;

public interface TestInterface {
    default void sameMethod(){
        System.out.println("invoke TestInterface Method!");
    }
}
