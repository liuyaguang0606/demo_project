package com.yzzg.biz.java8_interface_01;

public class InterfaceTest implements TestInterface1, TestInterface2 {
    @Override
    public String sayHello() {
        return null;
    }

    @Override
    public void sameMethod() {
        System.out.println(" test ");
    }
}
