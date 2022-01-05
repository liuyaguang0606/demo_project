package com.yzzg.biz.overload;



public class Person {
    private int i = test();
    private static int j = method();
    /** 静态代码块**/
    static {
        System.out.print("(1)");
    }

    /** 构造方法**/
    public Person(){
        System.out.print("(2)");
    }

    /** 构造代码块**/
    {
        System.out.print("(3)");
    }

    public static int method() {
        System.out.print("(4)");
        return 1;
    }

    public int test() {
        System.out.print("(5)");
        return 1;
    }
    public static void personStatic() {
        System.out.println("person-static");
    }

    public static void main(String[] args) {
        // (4)(1)
    }

}
