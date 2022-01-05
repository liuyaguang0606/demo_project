package com.yzzg.biz.set_treeSet_03;

import java.util.TreeSet;

/**
 * 初次 ： Student 没有实现Comparable 执行main报错com.yzzg.biz.set_treeSet_03.Student cannot be cast to java.lang.Comparable
 * 原因：TreeSet 集合存储元素时 必须具有比较性的元素才可以
 * 例如：String 等。。 查看api 可以看到String 默认继承了Comparable 接口 所以存储String类型的不会报错
 * 如何解决？ 只需要Student  实现 Comparable 接口覆写 compareTo方法即可
 *
 * TreeSet集合 有两种排序方式：1、自然排序（实现Comparable接口） 2、比较器排序(使用TreeSet有参构造方法)
 *  1、要比较的元素实现Comparable接口 ，排序规则定义在ComparaTo() 方法里面
 *  需求：按照年龄排序  -- 主要条件    次要条件要自己思考
 *
 */
public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Student> ts = new TreeSet<Student>();


        Student s1 = new Student("linqingxia",27);
        Student s2 = new Student("zhangguorong",29);
        Student s3 = new Student("wanglinhong",23);
        Student s4 = new Student("linqingxia",27);
        Student s5 = new Student("liushishi",22);
        Student s6 = new Student("wuqilong",40);
        Student s7 = new Student("fengqing",22);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);


        for (Student s : ts) {
            System.out.println(s.getName() + "-----" + s.getAge());
        }



    }
}
