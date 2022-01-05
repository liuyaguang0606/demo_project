package com.yzzg.biz.reflect_annotation;

@MyTest
@Test(name="person")
public class Person {

    private String name;
    private int age;
    private String address;


    @Test(name = "haha")
    public String getString(){
        System.out.println("获取你好");
        return "nihao";
    }

    @MyTest
    private String calcMethod(int a, int b){
        System.out.println("计算方法");
        return "calc";
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
}
