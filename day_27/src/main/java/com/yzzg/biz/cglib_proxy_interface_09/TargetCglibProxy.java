package com.yzzg.biz.cglib_proxy_interface_09;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TargetCglibProxy implements MethodInterceptor {


    public <E> E getCglibProxy(Class<E> eClass){
        //
        Enhancer enhancer = new Enhancer();
        // 设置代理对象的父类，cglib代理实际实现方式 是为代理对象生成子类
        // 设置代理对象的父类
        enhancer.setSuperclass(eClass);
        // 设置代理对象的要回调的对象
        enhancer.setCallback(this);
        return (E) enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("调用被代理对象的方法之前 对方法的增强");
        // 因为对接口做代理 生成接口子类时 要实现接口方法

        return "接口方法实现处理返回";
    }
}
