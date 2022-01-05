package com.yzzg.biz.set_hashSet_01;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<Student>();

        Student s1 = new Student("林青霞",27);
        Student s2 = new Student("柳岩",22);
        Student s3 = new Student("王祖贤",30);
        Student s4 = new Student("林青霞",27);
        Student s5 = new Student("林青霞",20);
        Student s6 = new Student("范冰冰",22);


        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        hs.add(s5);
        hs.add(s6);

        for (Student s : hs) {
            System.out.println(s.getName()+ "---" + s.getAge());
        }
    }
}
