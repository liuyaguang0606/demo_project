package com.yzzg.biz.lambda_00;

import java.util.Comparator;

/**
 * 一、Lambda 表达式的基本语法：
 *  Java8 引入了一个新的操作符 " -> " 该操作符称之为箭头操作符 或 Lambda操作符；
 *      箭头操作符将lambda表达式 拆分成两部分 ：
 *      左侧 ：lambda 表达式的参数列表
 *      右侧：lambda 表达式中需要执行的功能，即lambda 体
 *
 *  lambda 表达式语法格式：
 *  语法格式一：无参数 ，无返回值
 *      () -> System.out.println("Hello Lambda!");
 *
 *  语法格式二：有一个参数，并且无返回值
 *      (x) -> System.out.println("Hello Lambda!");
 *
 *  语法格式三：若只有一个参数，lambda表达式 参数列表小括号可以不写
 *      x -> System.out.println("Hello Lambda!");
 *
 *  语法格式四：两个以及以上参数，有返回值，并且lambda表达式体中有多条语句
 *      Comparator<Integer> com = (x, y) -> {
 *             int flage = x.compareTo(y);
 *             return flage;
 *         };
 * 注意：
 * 1、lambda 表达式参数列表中,两个以上参数 参数列表小括号不能省略;
 * 2、lambda 表达式中有多条语句时 方法体不能省略；
 *
 *  语法格式五：若lambda体中只有一条语句，return 和 大括号都可以省略不写
 *      Comparator<Integer> com = (x, y) -> x.compareTo(y);
 *
 *  语法格式六：lambda参数列表的数据类型可以省略不写，因为JVM编译器通过上下文推断出数据类型， 即 "类型推断";
 *      Comparator<Integer> com = (Integer x, Integer y) -> x.compareTo(y);
 *
 *
 */
public class LambdaDemo {
    public static void main(String[] args) {
        MyLambda lambda = (x) -> System.out.println("Hello Lambda!");
        lambda.test("123");

//        Comparator<Integer> com = ( x, y) -> {
//            int flage = x.compareTo(y);
//            return flage;
//        };

        Comparator<Integer> com = (Integer x, Integer y) -> x.compareTo(y);
    }
}
