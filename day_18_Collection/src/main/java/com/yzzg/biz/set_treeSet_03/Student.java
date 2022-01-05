package com.yzzg.biz.set_treeSet_03;

public class Student implements Comparable<Student>{
    private String name;
    private int age;


    public Student(){}

    public Student(String name, int age) {
        this.name = name;
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

    @Override
    public int compareTo(Student s) {
        int num = this.age - s.getAge();
        int num2 = num == 0 ? this.name.compareTo(s.name) : num;
        return num2;
    }
}
