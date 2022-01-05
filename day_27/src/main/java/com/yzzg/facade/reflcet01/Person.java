package com.yzzg.facade.reflcet01;

public class Person extends BaseRo{
    private String name;
    int age;
    public String address;

    public Person(){

    }
    public Person(String name, int age, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 默认构造方法
    Person(String name) {
        this.name = name;
    }
    // 私有构造方法
    private Person(int age) {
        this.age = age;
    }




    private void preTest1(String str) {
        System.out.println(str);
    }
    private String preTest2(){
        System.out.println("preTest2");
        return "preTest2";
    }
    public void pubTest1(){
        System.out.println("pubTest1");
    }
    public int pubTest2(int i){
        System.out.println("pubTest2" + i);
        return i;
    }

    void defautTest1(){
        System.out.println("defautTest1");
    }
    String defaultTest2(int i){
        System.out.println("defaultTest2 = " + i);
        return "defaultTest2";
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
