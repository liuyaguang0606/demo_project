package com.yzzg.biz.model_09;

/**
 * 饿汉式
 */
public class Student {

    // 这里要私有构造方法,为了不让外界new 创建对象;
    private Student(){
    }

    // 私有：为了不让外部直接访问; 静态：是提供get方法使用
    private static Student s = new Student();

    public static Student getStudentInstance() {
        return s;
    }


}
