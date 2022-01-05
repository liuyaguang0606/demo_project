package com.yzzg.java.lambda_03_stream_01;


import com.yzzg.java.lambda_00.Employee;
import com.yzzg.java.lambda_00.Employee.*;

import java.util.Arrays;
import java.util.List;

/**
 * 终止操作
 */
public class StreamAPIDemo4 {

    private static List<Employee> employees = Arrays.asList(
            new Employee("张三",18, 9999.99, Status.FREE),
            new Employee("李四",58, 5555.55, Status.BUSY),
            new Employee("王五",26, 3333.33, Status.VOCATION),
            new Employee("赵六",36, 6666.66, Status.FREE),
            new Employee("田七",12, 8888.88, Status.BUSY)
    );
    public static void main(String[] args) {
        /**
         * 查询 与 匹配
         */
        test0();
    }


    public static void test0(){
        boolean b1 = employees.stream()
                .allMatch((e) -> e.getStatus().equals(Status.BUSY));
        System.out.println(b1);
    }
}
