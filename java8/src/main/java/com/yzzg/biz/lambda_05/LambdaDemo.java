package com.yzzg.biz.lambda_05;

import java.io.PrintStream;
import java.util.function.Consumer;


/**
 * 注意：
 * 1、当 lambda体中只有一条语句时 return 可以省略不写, 但是不能加{}, 加{} 就不能省略return;
 * 2、当参数列表只有一个参数时  小括号() 可以省略不写，
 * 3、参数列表的参数无论几个，参数的数据类型要写 ，全都写，要不写都不写
 * 4、4.1、当lambda体中，如果已经存在方法实现了操作业务逻辑/功能操作，可以使用方法引用 格式：“对象 :: 方法名” 声明
 *   4.2、void accept() 要与引用方法的参数列表、返回值 相同
 */
public class LambdaDemo {
    public static void main(String[] args) {
        /**
         * 当参数列表只有一个参数时  小括号() 可以省略不写，
         * 参数列表的参数无论几个，参数的数据类型要写 ，全都写，要不写都不写
         */
        // 原始型
        Consumer<String> consumer = (String x) -> {
            System.out.println(x);
        };
        consumer.accept("test");

        // lambda表达式中 方法引用型; System.out::println 这里相当于声明了方法的引用，要调用那个方法；
        Consumer<String> con = System.out::println;
        // con.accept这就相当于,在accept()方法中(调用了)引用了方法 println() ,参数传递到println();
        con.accept("1234");
        /**
         * 所以 方法引用 需要注意的事项：
         * 1、当lambda体中，如果已经存在方法实现了操作业务逻辑/功能操作，可以使用方法引用 格式：“对象 :: 方法名” 声明
         * 2、void accept() 要与引用方法的参数列表、返回值 相同
         */




    }
}
