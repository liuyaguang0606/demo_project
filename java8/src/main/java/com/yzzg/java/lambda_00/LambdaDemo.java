package com.yzzg.java.lambda_00;


import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * @author liuyaguang
 */
public class LambdaDemo {
    public static void main(String[] args) {
        test7();
    }

    /**
     * 原来匿名内部类方式
     */
    public static void test01(){
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
    }
    /**
     * lambda 表达式方式
     */
    public static void test02(){
        Comparator<Integer> com = (x,y) -> Integer.compare(x,y);
        TreeSet<Integer> set = new TreeSet<>(com);
    }

    private static List<Employee> employees = Arrays.asList(
            new Employee("张三",18, 9999.99),
            new Employee("李四",38, 5555.55),
            new Employee("王五",50, 6666.66),
            new Employee("赵六",16, 3333.33),
            new Employee("田七",8, 7777.77)
            );

// ============================================================================== //

    // 需求：获取当前公司员员工年龄大于35的员工信息
    /**
     * 老的过滤方式是通过遍历
     *  1、后面可能需求变了，获取薪资大于5000的 ;这样又要加一个方法
     * @param list
     * @return
     */
    public static List<Employee> filterEmployees(List<Employee> list) {
        List<Employee> employees = new ArrayList<>();

        for (Employee emp : list) {
            if (emp.getAge() > 35) {
                employees.add(emp);
            }
        }
        return employees;
    }
    // 需求：获取当前公司员员工薪资大于5000的员工信息

    public static List<Employee> filterEmployees2(List<Employee> list) {
        List<Employee> employees = new ArrayList<>();

        for (Employee emp : list) {
            if (emp.getSalary() > 5000) {
                employees.add(emp);
            }
        }
        return employees;
    }

    /**
     * 优化一
     *  1、一般都是用公共方法抽取 这样也不是最优的
     *  2、通过设计模式 策略模式
     */
    public static List<Employee> filterEmployees(List<Employee> list, MyPredicate<Employee> mp){
        List<Employee> empList = new ArrayList<>();
        for (Employee em : list) {
            if (mp.test(em)) {
                empList.add(em);
            }
        }
        return empList;
    }

    /**
     * 薪资大于5000的
     * @param list
     * @param mp
     * @return
     */
    public static List<Employee> filterEmployees2(List<Employee> list, MyPredicate mp){
        List<Employee> empList = new ArrayList<>();
        for (Employee em : list) {
            if (mp.test(em)) {
                empList.add(em);
            }
        }
        return empList;
    }

    /**
     *  匿名内部类 , 通过匿名内部类 省略继承类
     */
    public static void test5(){
        filterEmployees(employees, new MyPredicate<Employee>(){

            @Override
            public boolean test(Employee employee) {
                return employee.getSalary() < 5000;
            }
        });
    }


    /**
     * 优化三
     *  lambda 表达式
     */
    public static void test6(){
        List<Employee> list = filterEmployees(employees, (e) -> e.getSalary() > 5000);
        list.forEach(System.out::println);
    }

    /**
     * 优化四
     *  stream流 API  假设上面所有的方法都没有 ，只有集合类
     */
    public static void test7(){
        List<Employee> empList1 = employees.stream()
                .filter((e) -> e.getSalary() > 5000)
                .limit(2)
                .collect(Collectors.toList());
        empList1.forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
        employees.stream()
                .filter((e) -> e.getSalary() > 5000)
                .limit(2)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------------");
        employees.stream()
                .filter((e) -> e.getSalary() > 5000)
                .limit(2)
                .map((e) -> e.getName())
//                .map(Employee::getName)
                .forEach(System.out::println);
    }





}
