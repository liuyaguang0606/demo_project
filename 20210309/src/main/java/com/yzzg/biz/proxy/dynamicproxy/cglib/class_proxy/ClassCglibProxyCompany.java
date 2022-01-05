package com.yzzg.biz.proxy.dynamicproxy.cglib.class_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ClassCglibProxyCompany implements MethodInterceptor {

    private Object targer;

    public ClassCglibProxyCompany() {
    }

    public ClassCglibProxyCompany(Object targer) {
        this.targer = targer;
    }


    public Object getTargerProxy(Object o){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(o.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib .. class ...数据缓存");
        Object invoke = methodProxy.invoke(targer, objects);
        return invoke;
    }
}
