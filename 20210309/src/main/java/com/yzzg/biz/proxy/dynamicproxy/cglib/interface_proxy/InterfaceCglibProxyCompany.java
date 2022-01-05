package com.yzzg.biz.proxy.dynamicproxy.cglib.interface_proxy;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import javax.sql.DataSource;
import java.lang.reflect.Method;

public class InterfaceCglibProxyCompany implements MethodInterceptor {



    public Object getTargerProxy(Class clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib .. interface ...数据缓存");
        /**
         * 对接口做代理时 ，不能调用methodProxy.invokeSuper(o, objects)
         *  因为接口没有 具体实现逻辑，所以自己要实现这个方法逻辑
         */
        String ss = "....接口实现逻辑....";
        return ss;
    }


    public static void main(String[] args) {
        double random = Math.random();
        System.out.println(random);
        System.out.println(random * 900000);
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.close();

    }

}
