package com.yzzg.java.lambda_03_stream_01;

import com.yzzg.java.lambda_00.Employee;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StreamAPIDemo5 {


    private static List<Employee> employees = Arrays.asList(
            new Employee("张三",18, 9999.99, Status.FREE),
            new Employee("李四",58, 5555.55, Status.BUSY),
            new Employee("王五",26, 3333.33, Status.VOCATION),
            new Employee("赵六",36, 6666.66, Status.FREE),
            new Employee("田七",12, 8888.88, Status.BUSY),
            new Employee("田七",12, 8888.88, Status.BUSY)
    );


    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }


    public static void test3(){
        // 统计长度
        long l = employees.stream()
                .count();
        System.out.println(l);
        Long length = employees.stream()
                .collect(Collectors.counting());
        System.out.println(length);

        // 平均值
        Double salary = employees.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(salary);

        //总和
        Double dd = employees.stream()
                .collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println(dd);

        // 最大值
        // 最小值

        // 分组
        Map<Status,List<Employee>> empGroup = employees.stream()
                .collect(Collectors.groupingBy(Employee::getStatus));
        // 多级分组
        Map<Status,Map<String,List<Employee>>> emp = employees.stream()
                .collect(Collectors.groupingBy(Employee::getStatus, Collectors.groupingBy((e) -> {
                    if (e.getAge() > 35) {
                        return "老年";
                    }else {
                        return "青年";
                    }
                })));

        // 分区 ：满足条件一个区， 不满足条件另外一个区

    }


    public static void test2(){
        List<Employee> emp = employees.stream()
                .filter((e) -> e.getStatus().equals(Status.BUSY))
                .collect(Collectors.toList());
        emp.forEach(System.out::println);

        System.out.println("--------------------------------");

        LinkedHashSet link = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        link.forEach(System.out::println);


    }



    public static void test1(){
        Optional<Double> d = employees.stream()
                .map(Employee::getSalary)
                .reduce((x,y) -> x+y);
        System.out.println(d.get());
    }
    /**
     * reduce:规约   可以将流中元素反复结合起来，得到一个值
     * 需求一：累加
     */
    public static void test0(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer sum = list.stream()
                .reduce(0, (x,y) -> x+y);
        System.out.println(sum);
    }




}
