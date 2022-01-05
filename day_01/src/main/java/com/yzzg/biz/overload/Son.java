package com.yzzg.biz.overload;

public class Son extends Person{
    private int i = test();
    private static int j = method();

    /**静态代码块**/
    static {
        System.out.print("(6)");
    }
    /**构造方法**/
    public Son(){
        System.out.print("(7)");
    }
    /**构造代码块**/
    {
        System.out.print("(8)");
    }
    @Override
    public int test() {
        System.out.print("(9)");
        return 1;
    }
    public static int method(){
        System.out.print("(10)");
        return 1;
    }
    public static void sonStatic() {
        System.out.println("son-static");
    }

    public static void main(String[] args) {
        Son son1 = new Son();
        System.out.println();
        Son son2 = new Son();
        // 1、首先类加载初始化 (4)(1)(10)(6) (9)(3)(2) (9)(8)(7)
        // 2、第二次实例初始化 (9)(3)(2) (9)(8)(7)

    }


}
