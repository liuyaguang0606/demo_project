package com.yzzg.biz.reflect_Method_03;

public class Person {
    private String name;
    int age;
    public String address;


    public Person(){
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    private Person(String name) {
    }

    // 方法
    public void show(){
        System.out.println("show");
    }

    public void method(String s){
        System.out.println("methode : " + s);
    }

    public String getString(String s, int i) {
        return s +"-----" +i;
    }

    private void function(){
        System.out.println("function");
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
