package com.yzzg.biz.qianfeng.reflection;


public class Person {
    private String name;

    private Long id;

    private int age;

    public Person() {
    }

    private Person(String name) {
        this.name = name;
    }

    public Person(String name, Long id) {
        this.name = name;
        this.id = id;
    }


    public void test(){
        System.out.println("test()");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
