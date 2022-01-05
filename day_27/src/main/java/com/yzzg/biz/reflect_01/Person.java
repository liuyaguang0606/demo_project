package com.yzzg.biz.reflect_01;

public class Person {
    private String name;
    private int age;
    public String address;

    private Person(String name){
        this.name = name;
    }
    public Person(){ }

    public Person(String name , int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void getString (String str){
        System.out.println("getString");
    }

    public String getMethod(){
        System.out.println("getMethod");
        return "str";
    }

    private void eat(){
        System.out.println("eat");
    }

    private String haha(String name){
        System.out.println("大声笑" + name);
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
