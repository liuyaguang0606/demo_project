package com.yzzg.biz.reflect_dynamic_proxy_06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Objects;

/**
 * 从静态代理 演变到动态代理
 * 动态代理 测试类
 */
public class DynamicProxyDemo{
    public static void main(String[] args) {
        Automaker a = new HongQiCarAutomaker();
        //
        InvocationHandler handler = new MyInvocation(a);
        //此时的代理对象是由Java系统自动生成的一个代理对象
        Object object = Proxy.newProxyInstance(a.getClass().getClassLoader(), a.getClass().getInterfaces(), handler);
        Automaker automaker = null;
        if (object instanceof Automaker) {
            automaker = (Automaker) object;
            automaker.sellCar();
        }else {
            System.out.println("else");
        }


    }



}
