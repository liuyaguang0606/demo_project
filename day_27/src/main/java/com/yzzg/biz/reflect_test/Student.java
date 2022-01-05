package com.yzzg.biz.reflect_test;

import com.yzzg.biz.reflect_annotation.Test;
import com.yzzg.biz.reflect_test.annotation.Cache;
import com.yzzg.biz.reflect_test.annotation.Test02;

/**
 * 测试对象
 * 通过反射测试获取 所有属性、构造方法、方法
 */
@Cache
@Test02(name = "test02_student")
public class Student extends Person{

    int age;
    @Cache(name="haha同学private_name")
    private String name;
    @Cache(name="haha同学public_address")
    public String address;
    private static int staticFieldInt;
    @Test(name="test测试使用")
    public static String staticField;



    //private
    private Student(){}

    public Student(String name) {
        this.name = name;
    }

    // defualt
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // staticMethod
    public static void staticMethod(){
        System.out.println("staticMethod");
    }
    public void print(){
        System.out.println("public print");
    }

    @Cache(name="public_getString()")
    public String getString(String name){
        System.out.println("public print : " + name);
        return name;
    }

    void reflectMethod(){
        System.out.println("default  reflectMehtod : ");
    }

    @Cache(name="private_sum(int a, int b)")
    private int sum(int a, int b) {
        System.out.println("sum a + b = " + (a+b));
        return a+b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
