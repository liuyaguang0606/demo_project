package com.yzzg.java.lambda_01;

import com.yzzg.java.lambda_00.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestLambda {


    private static List<Employee> employees = Arrays.asList(
            new Employee("张三",18, 9999.99),
            new Employee("李四",38, 5555.55),
            new Employee("王五",50, 6666.66),
            new Employee("赵六",16, 3333.33),
            new Employee("田七",8, 7777.77)
    );

    public static void main(String[] args) {

        Long re = test2(100L, 200L);
        System.out.println(re);
    }

    public static void test1(){
        Collections.sort(employees, (e1, e2) -> {
            if (e1.getAge() == e2.getAge()){
                if (e1.getName() == e2.getName()){
                    return 1;
                }
            }
            return -1;
        });
        employees.forEach(System.out::println);
    }

    public static Long test2(Long l1, Long l2){

        Long result = calcNum(l1, l2, (t1, t2) -> {
            return t1 + t2;
        });
        return result;
    }
    public static Long calcNum(Long l1, Long l2, MyFunction<Long, Long> my){
        return my.getValue(l1,l2);
    }




}
