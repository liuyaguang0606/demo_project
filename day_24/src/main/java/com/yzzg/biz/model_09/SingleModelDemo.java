package com.yzzg.biz.model_09;


/**
 * 单例设计模式
 *      1、懒汉式： 面试使用 存在线程安全问题，
 *      2、饿汉式：开发使用 不会出现安全问题，原子性操作； jdk中Runtime 类创建就是使用饿汉式创建方式；
 */
public class SingleModelDemo {

    public static void main(String[] args) {
        // 饿汉式创建学生单例对象
        Student s1 = Student.getStudentInstance();
        Student s2 = Student.getStudentInstance();

        System.out.println("s1 :" + s1);
        System.out.println("s2 :" + s2);
        System.out.println(s1 == s2);

        // 懒汉式
        Teacher t1 = Teacher.getTeacherInstance();
        Teacher t2 = Teacher.getTeacherInstance();
        System.out.println("t1 :" + t1);
        System.out.println("t2 :" + t2);
        System.out.println(t1 == t2);
    }
}
