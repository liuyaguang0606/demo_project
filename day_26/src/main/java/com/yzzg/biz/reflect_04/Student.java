package com.yzzg.biz.reflect_04;

public class Student {

    private String name;

    private int age;


    public void eat(String food){
        System.out.println("学生今天吃：" + food);
    }




    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
