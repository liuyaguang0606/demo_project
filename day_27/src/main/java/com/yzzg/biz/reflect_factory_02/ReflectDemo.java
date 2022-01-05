package com.yzzg.biz.reflect_factory_02;

public class ReflectDemo {
    public static void main(String[] args) {
        // 传统的静态工厂模式
//        IBook book = StaticFactory.getInstance("math");
//        book.read();
        /**
         * 极端考虑 ： 当实现Ibook 接口有十万个实现类 （书的实现类） ，静态工厂中要有十万个if else 判断
         */

        // 动态工厂模式
        IBook book = DynamicFactory.getInstance("com.yzzg.biz.reflect_factory_02.ProgramBook");
        book.read();
    }
}
