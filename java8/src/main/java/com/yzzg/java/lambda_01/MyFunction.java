package com.yzzg.java.lambda_01;

public interface MyFunction<T, R> {
    public abstract R getValue(T t1, T t2);
}
