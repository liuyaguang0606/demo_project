package com.yzzg.java.lambda_02;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;


/**
 * 二、方法引用：若lambda体中的内容有方法已经实现，我们可以使用 “方法引用”
 *            （可以理解为方法引用是lambda 表达式的另外一种表现形式）
 *
 *   主要有三种语法格式：
 *      对象::实例方法名
 *
 *      类::静态方法名
 *
 *      类::实例方法名
 *
 *   注意：
 *      1、使用方法引用的前提：lambda体中调用方法的参数列表与返回值类型，要与函数式接口中抽象方法的参数列表和返回值类型保持一致
 *      2、若lambda体中 方法的参数列表中第一个参数是实例方法的调用者，而第二参数是实例方法的参数时，可以使用ClassName::method (类名::方法名)
 *
 *
 * 三、 构造器引用:
 *  格式：
 *  ClassName::new
 *  注意：需要调用的构造器的参数列表要与函数式接口中抽象方法的参数列表保持一致！
 *
 */
public class lambdaDemo {
    public static void main(String[] args) {
//        test01();
        test05();
    }


    /**
     * 构造器应用
     *
     */
    public static void test05(){
        // lambda
        Supplier<Employee> sup = () -> new Employee();

        // 构造器写法
        Supplier<Employee> sup1 = Employee::new;
        Employee emp = sup1.get();
        System.out.println(emp);


        Function<String, Employee> function = (x) -> new Employee();

        Function<String, Employee> fun = Employee::new;
        System.out.println(fun.apply("zhangsan"));

    }




    /**
     * 类名::实例方法名
     */
    public static void test03(){
        // lambda 表达式写法
        BiPredicate<String,String> bp = (x, y) -> x.equals(y);
        // 方法引用的写法
        BiPredicate<String,String> bp1 = String::equals;
    }


    /**
     * 类名::静态方法名
     */
    public static void test02(){
        // lambda 表达式写法
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
        // 方法引用写法
        Comparator<Integer> com1 = Integer::compare;

    }


    /**
     * 对象::实例方法名
     */
    public static void test01(){
        // 打印 一个String入参，无返回值
        PrintStream ps1 = System.out;
        Consumer<String> con = (x) -> ps1.println(x);
        con.accept("ps1");
        // 变形1
        PrintStream ps2 = System.out;
        Consumer<String> con1 = ps2::println;
        con1.accept("ps2");
        //变形2
        Consumer<String> con2 = System.out::println;
        con2.accept("ps3:nihao");

    }
}
