package com.yzzg.java.lambda_03_stream_01;

import com.yzzg.java.lambda_00.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo2 {

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
     * 筛选 过滤   映射
     * @param args
     */
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
//        test5();
        test6();
    }

    public static void test6(){
        List<String> list = Arrays.asList("aaa","bbb","ccc");
        Stream<Stream<Character>> stream = list.stream()
                .map(StreamAPIDemo2::filterChar);

        stream.forEach((sm) -> sm.forEach(System.out::println));
        System.out.println("------------------------------");

        Stream<Character> stream1 = list.stream()
                .flatMap(StreamAPIDemo2::filterChar);

        stream1.forEach(System.out::println);


    }

    public static Stream<Character> filterChar(String str) {
        List<Character> chList = new ArrayList<>();
        for (Character c : str.toCharArray()){
            chList.add(c);
        }
        return chList.stream();
    }

    public static void test5(){
        List<String> list = Arrays.asList("aaa","bbb","ccc");
        list.stream()
                .map((str) -> str.toUpperCase())
                .forEach(System.out::println);

        System.out.println("---------------------------");
        employees.stream()
                .map((e) -> e.getName())
                .forEach(System.out::println);

        System.out.println("---------------------------");
        employees.stream()
                .distinct()
                .map(Employee::getName)
                .forEach(System.out::println);

    }

    public static void test4(){
        employees.stream()
                .filter((e) -> e.getSalary() > 5000)
                .distinct()
                .forEach(System.out::println);
    }

    public static void test3(){
        employees.stream()
                .filter((e) -> e.getSalary() > 5000)
                .skip(2)
                .forEach(System.out::println);
    }

    public static void test2(){
        employees.stream()
                .filter((e) -> e.getSalary() > 5000)
                .limit(2)
                .forEach(System.out::println);
    }
    public static void test1(){
        Stream<Employee> list = employees.stream()
                .filter((e) -> {
                    System.out.println("当前对象" + e.toString());
                    return e.getAge() > 35;
                });

        System.out.println("-----------");
        list.forEach(System.out::println);
    }




}
