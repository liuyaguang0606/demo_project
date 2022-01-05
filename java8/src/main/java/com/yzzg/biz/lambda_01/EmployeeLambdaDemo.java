package com.yzzg.biz.lambda_01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeLambdaDemo {
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(
                new Employee("zhangsan", 23, 123),
                new Employee("lisi", 20, 444),
                new Employee("wangwu", 30, 666),
                new Employee("zhangliu", 23, 333),
                new Employee("chacha", 50, 444),
                new Employee("chacha", 60, 233)
                );
        Collections.sort(emps, (x,y) -> {
            int s = x.getAge() - y.getAge();
            return (s != 0) ? s : x.getSalary() - y.getSalary();
        });

        for (Employee employee : emps) {
            System.out.println(employee.toString());
        }

    }
}
