package com.yzzg.biz.reflect_04;

public class Teacher {

    private String name;
    private int age;

    public void eat(String food) {
        System.out.println("今天老师是：" + food);
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
