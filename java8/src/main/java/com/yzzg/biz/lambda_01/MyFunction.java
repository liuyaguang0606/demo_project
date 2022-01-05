package com.yzzg.biz.lambda_01;

@FunctionalInterface
public interface MyFunction<T> {

    public abstract  String getValue(String str);
}
