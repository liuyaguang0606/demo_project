package com.yzzg.biz.lambda_05;

public class Employee {
    private String name;
    private int age;


    public Employee(){}

    public Employee(String name) {
        this.name = name;
    }

    public Employee(Integer age) {
        this.age = age;
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
}
