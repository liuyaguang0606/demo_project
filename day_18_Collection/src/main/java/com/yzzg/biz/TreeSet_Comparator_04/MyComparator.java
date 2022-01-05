package com.yzzg.biz.TreeSet_Comparator_04;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {


    @Override
    public int compare(Student s1, Student s2) {
        // 按照姓名长度排序
        int num = s1.getName().length() - s2.getName().length();
        // 姓名内容排序
        int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
        // 年龄
        int num3 = num2 == 0 ? s1.getAge() - s2.getAge() : num2;
        return num3;
    }
}
