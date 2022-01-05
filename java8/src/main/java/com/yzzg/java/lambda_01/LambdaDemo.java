package com.yzzg.java.lambda_01;

import com.yzzg.java.lambda_00.MyPredicate;
import org.omg.PortableInterceptor.INACTIVE;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * 一、Lambda 表达式的基本语法：
 * Java8 引入一个新的操作符 "->" 该操作符称为箭头操作符 或Lambda 操作符，箭头操作符将Lambda表达式分成两部分：
 * 左侧：lambda 表达式的参数列表
 * 右侧：lambda 表达式中所需执行的功能，即lambda体
 *
 * lambda 表达式 是基于函数式接口编程的,接口中的抽象方法从参数列表 和返回值分为多种情况
 *  语法格式一：抽象方法 无参数列表， 无返回值
 *      () -> System.out.println("Hello World");
 *  语法格式二：有一个参数， 无返回值
 *      (x) -> System.out.println(x);
 *  语法格式三：如果只有一个参数，小括号可以省略不写
 *      x -> System.out.println(x);
 *  语法格式四：有两个以上的参数，有返回值，并且lambda体中有多条语句 ,{} 不能省略
 *      Comparator<Integer> com = (x, y) -> {
 *             System.out.println("函数式接口");
 *             return Integer.compare(x, y);
 *         };
 *
 *   语法格式五：如果lambda体中有只有一条语句时， {} 和 return 都可以省略不写
 *      Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
 *
 *   语法格式六：Lambda 表达式的参数列表的数据类型可以省略不写，因为JVM编译器通过上下文推断出，数据类型， 即 “类型推断”
 *
 *
 *
 *
 *
 *
 */
public class LambdaDemo {
    public static void main(String[] args) {


    }

    public static void test00(){
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        };
        run.run();


        Runnable ran =  () -> System.out.println("Hello World");
        ran.run();


        Thread t1 = new Thread(() -> System.out.println(Thread.currentThread().getName() + ": hallo world"),"窗口1");
        t1.start();
    }

    public static void test01(){
        Consumer<String> con = x -> System.out.println(x);
        con.accept("你好 lambda");

    }

    // 语法格式四：有两个以上的参数，有返回值，并且lambda体中有多条语句
    public static void test02(){
        Comparator<Integer> com = (x, y) -> {
            System.out.println("函数式接口");
            return Integer.compare(x, y);
        };
    }

    // 语法格式五：如果lambda体中有只有一条语句时， {} 和 return 都可以省略不写
    public static void test03(){
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
    }





}
