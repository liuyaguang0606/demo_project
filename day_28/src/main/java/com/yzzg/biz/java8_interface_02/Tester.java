package com.yzzg.biz.java8_interface_02;

public class Tester {
    public static void main(String[] args) {
        Son son = new Son();
        son.sameMethod();

        Father father = new Son();
        father.sameMethod();

        TestInterface testInterface = new Son();
        testInterface.sameMethod();

    }
}
