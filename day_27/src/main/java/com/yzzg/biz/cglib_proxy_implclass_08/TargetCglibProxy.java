package com.yzzg.biz.cglib_proxy_implclass_08;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 1、使用cglib 对目标类的动态代理
 *      cglib 是基于方法级别的 所以 要继承 MethodInterceptor
 *
 */
public class TargetCglibProxy implements MethodInterceptor {

    private Object targer;

    public TargetCglibProxy() {
    }

    public TargetCglibProxy(Object targer) {
        this.targer = targer;
    }

    /**
     * 获取真正的代理类
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> T getTargetProxy(Class clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }

    /**
     * @param o   代理对象
     * @param method
     * @param objects  方法参数
     * @param methodProxy 代理方法
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // 调用代理对象 方法之前
        System.out.println("方法限流........");

        // 后面会发现 cglib 代理实际上是 为目标代理对象生成一个子类对象
        return methodProxy.invokeSuper(o, objects);
    }
}
