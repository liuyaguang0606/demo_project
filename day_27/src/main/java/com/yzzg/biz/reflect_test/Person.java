package com.yzzg.biz.reflect_test;

public class Person {
    private String name;
    public String personName;

    public Person(){

    }

    public void init(){
        System.out.println("init");
    }
    public Person(String name, String personName) {
        this.name = name;
        this.personName = personName;
    }



    private String privateMethod(){
        System.out.println("privateMehtod");
        return "privateMethod";
    }

}
