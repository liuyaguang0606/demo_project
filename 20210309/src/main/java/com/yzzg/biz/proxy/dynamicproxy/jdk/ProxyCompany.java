package com.yzzg.biz.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyCompany implements InvocationHandler {

    /**被代理的制造商 目标对象**/
    private Object tagerObject;

    public ProxyCompany() {
    }

    public ProxyCompany(Object tager) {
        this.tagerObject = tager;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        // 动态代理底层  反射
        Object invoke = method.invoke(tagerObject, args);
        after();
        return invoke;
    }


    public void before(){
        System.out.println("before....准备代购的资料..... ");
    }

    public void after(){
        System.out.println("after....统一打包邮寄代购.....");
    }

}
