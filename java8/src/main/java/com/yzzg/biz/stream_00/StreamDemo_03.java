package com.yzzg.biz.stream_00;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo_03 {
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(
                new Employee("张三", 18, 9999.99D),
                new Employee("李四", 58, 3333.99D),
                new Employee("王五", 26, 5555.99D),
                new Employee("赵六", 36, 4444.99D),
                new Employee("田七", 12, 7777.99D)

        );

        boolean b = emps.stream().allMatch((x) -> x.getAge() > 30 );
        boolean b1 = emps.stream().allMatch((x) -> x.getSalay().equals(9999.99));
        System.out.println(b);
        System.out.println(b1);

        boolean eb = emps.stream().anyMatch((x) -> x.getAge() > 30);
        System.out.println(eb);

        Long count = emps.stream().count();
        System.out.println(count);

        Optional<Employee> max = emps.stream().max((e1, e2) -> e1.getSalay().compareTo(e2.getSalay()));
        System.out.println(max);

        Optional<Double> aDouble = emps.stream().min((e1, e2) -> e1.getSalay().compareTo(e2.getSalay())).map(Employee::getSalay);
        System.out.println(aDouble);
        System.out.println(aDouble.get());

    }
}
