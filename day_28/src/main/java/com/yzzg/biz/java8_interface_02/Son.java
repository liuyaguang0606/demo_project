package com.yzzg.biz.java8_interface_02;

public class Son extends Father implements TestInterface {
    @Override
    public void sameMethod() {
        System.out.println("invoke Son Method!");
    }
}
