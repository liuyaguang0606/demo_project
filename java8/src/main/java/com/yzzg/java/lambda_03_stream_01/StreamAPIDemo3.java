package com.yzzg.java.lambda_03_stream_01;

import com.yzzg.java.lambda_00.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamAPIDemo3 {
    private static List<Employee> employees = Arrays.asList(
            new Employee("张三",18, 9999.99),
            new Employee("李四",58, 5555.55),
            new Employee("王五",26, 3333.33),
            new Employee("赵六",36, 6666.66),
            new Employee("田七",12, 8888.88),
            new Employee("田七",12, 8888.88),
            new Employee("田七",12, 8888.88)
    );

    /**
     * 排序
     * @param args
     */
    public static void main(String[] args) {
//        test0();
        test1();
    }





    public static void test1(){
        employees.stream()
                .distinct()
                .sorted((e1,e2) -> {
                    return e1.getAge() >= e2.getAge() ? 1 : -1;
                }).forEach(System.out::println);
        System.out.println("-----------------------------");

    }

    public static void test0(){
        List<String> list = Arrays.asList("eee","aaa","ccc","ddd","bbb");
        list.stream()
                .sorted()
                .forEach(System.out::println);
    }

}
