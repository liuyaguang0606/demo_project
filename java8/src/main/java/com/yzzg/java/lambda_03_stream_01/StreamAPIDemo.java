package com.yzzg.java.lambda_03_stream_01;

import com.yzzg.java.lambda_00.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *  一、什么时Stream流？
 *      流(Stream) 是数据通道，用于操作数据源（集合、数组等） 所生成的元素序列。
 *      “集合讲的数据，流讲的计算”
 *  注意：
 *      1、Stream 自己不会存储数据元素
 *      2、Stream 不会改变源对象。相反，他们会返回一个持有结果的新Steam。
 *      3、Stream 操作是延迟执行的。这意味着他们会等到需要结果的时候才执行。
 *
 *
 * 二、Stream 的三个操作步骤
 *  1、创建Stream
 *  2、中间操作
 *  3、终止操作（终端操作）
 */
public class StreamAPIDemo {

    public static void main(String[] args) {
        // 1、通过Collection 系列集合提供的Stream() 或 parallelStream()
        List<String> list = new ArrayList<>();
        Stream<String> s1 = list.stream();

        // 2、通过Arrays中的静态方法stream() 获取数组流
        Employee[] emps = new Employee[10];
        Stream<Employee> s2 = Arrays.stream(emps);

        // 3、通过Stream 类中的静态方法of()
        Stream<String> s3 = Stream.of("aa","bb","cc");

        // 4、创建无限流，通过迭代器
        Stream<Integer> s4 = Stream.iterate(0, (x) -> x+2)
                .limit(5);
        s4.forEach(System.out::println);

        // 5、生成
        Stream.generate(() -> Math.random())
                .limit(5)
                .forEach(System.out::println);


    }
}
