package com.yzzg.biz.lambda_05;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 注意：
 * 1、当 lambda体中只有一条语句时 return 可以省略不写, 但是不能加{}, 加{} 就不能省略return;
 * 2、当参数列表只有一个参数时  小括号() 可以省略不写，
 * 3、参数列表的参数无论几个，参数的数据类型要写 ，全都写，要不写都不写
 * 4、4.1、当lambda体中，如果已经存在方法实现了操作业务逻辑/功能操作，可以使用方法引用 格式：“对象 :: 方法名” 声明
 *   4.2、void accept() 要与引用方法的参数列表、返回值 相同
 */

/**
 * 一方法引用：若lambda 体中的内容有方法已经实现了，我们可以使用 “方法引用”
 *      （可以理解 方法引用是lambda 另一种表现形式）
 *  主要有三种语法格式：
 *      1、对象 :: 实例方法名
 *      2、类 :: 静态方法名
 *      3、类 :: 实例方法名
 *  注意： 1、lambda体中调用方法的参数列表与返回值类型，要与函数式接口中抽象方法的函数列表和返回值类型保持一致
 *        2、若lambda参数列表中第一个参数 是实例方法的调用者，而第二个参数是实例方法的参数时，可以使用ClassName :: method
 *
 *
 *
 *
 * 二、构造器引用：格式：
 *  1、ClassName::new
 *  注意 ： 需要调用的构造器的参数列表要与函数式接口中抽象方法的参数列表保持一致！！
 *
 *  三、数组 引用：
 * 格式： Type::new
 *
 *
 */
public class LambdaDemo_01 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        //1、当 lambda体中只有一条语句时 return 可以省略不写, 但是不能加{}, 加{} 就不能省略return;
        Supplier<String> sup = () -> { return emp.getName();};
        String name = sup.get();
        System.out.println("name = " + name);

        //2、 类：方法引用的形式
        Supplier<String> supplier = emp::getName;
        String name2 = supplier.get();
        System.out.println("name2 = " + name2);

        //3、 接口：方法引用的形式
        Supplier<String> supp = new MyFuncton<String>(){
            @Override
            public <T> T getName() {
                return (T) "interface";
            }
        } :: getName;
        String name3 = supp.get();
        System.out.println("name3 = " + name3);


        // 4、
        Comparator<Integer> com = (x,y) -> Integer.compare(x,y);
        Integer i = com.compare(12,8);

        //静态方法引用 形式
        Comparator<Integer>  comm = Integer::compareTo;
        comm.compare(23,23);


        // 构造器引用  - 无参构造器  --lambda 写法
        Supplier<Employee> supplier1 = () -> new Employee();
        Employee employee = supplier1.get();
        System.out.println(employee);
        // 构造器引用  - 无参构造器   -- 构造器写法
        Supplier<Employee> supplier2 = Employee::new;
        Employee employee1 = supplier2.get();
        System.out.println(employee1);

        // 构造器引用  - 一个参数构造器  --lambda 写法
        Function<Integer,Employee> function = (x) -> new Employee();
        // 构造器引用  - 一个参数构造器  --构造器引用 写法
        Function<Integer, Employee> function1 = Employee::new;


        // 数组   lambda写法
        Function<Integer,String[]> arr = (x) -> new String[x];
        String[] ss = arr.apply(10);
        System.out.println("ss:" + ss);
        //  构造器引用写法
        Function<Integer,String[]>  arrr = String[] :: new;
        String[] s = arrr.apply(10);
        System.out.println("s=" + s);



    }
}
