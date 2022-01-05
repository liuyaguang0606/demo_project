package com.yzzg.biz.reflect_proxy_07;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    // 被代理的目标对象
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 代理对象执行代理方法前
        System.out.println("==权限校验==");
        Object obj = method.invoke(target, args);
        System.out.println("==日志记录==");
        return obj;
    }

}
