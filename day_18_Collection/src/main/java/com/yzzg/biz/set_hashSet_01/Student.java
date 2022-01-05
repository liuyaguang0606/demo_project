package com.yzzg.biz.set_hashSet_01;

public class Student {
    private String name;
    private int age;

    public Student(){

    }
    public Student(String name, int age) {
        super();
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
    public int hashCode() {
        // 自定义 为了是 哈希值散列 更均匀， *15 可以随便
        // 一般 引用类型获取哈希值 + 基础数据值 乘以个值
        return this.name.hashCode() + this.age * 15;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println(this + "-----" + obj);
        if (this == obj)
            return true;

        if (!(obj instanceof Student))
            return false;

        Student s = (Student) obj;
        return this.name.equals(s.name) && this.age == s.age;
    }
}
