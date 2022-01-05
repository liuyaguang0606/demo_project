package com.yzzg.biz.lambda_00;

/**
 * lambda 表达式是 基于函数式接口
 */
@FunctionalInterface
public interface MyLambda {


    public abstract void test(String str);


    default void getString(){
        return ;
    }
}
