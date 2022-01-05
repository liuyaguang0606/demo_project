package com.yzzg.biz.java8_interface_01;

public interface TestInterface1 {

    public abstract String sayHello();

    default void sameMethod() {
        System.out.println("testInterface1");
    };
}
