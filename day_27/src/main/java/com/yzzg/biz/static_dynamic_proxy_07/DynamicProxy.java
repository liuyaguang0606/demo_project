package com.yzzg.biz.static_dynamic_proxy_07;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 假设还没出现手机代理时 只对汽车做代理 直接继承汽车接口；后续代理公司发展多元化对各个行业做代理，出现出现好多被代理接口
 * 后面出现 对手机行业做代理
 * 又出现对 对电脑行业做代理
 * 又出现对 对保险行业做代理，等等
 *  -- 解决要实现电脑抽象接口、保险抽象接口 还要把代理的目标对象包含到代理对象里面等
 * 这是就体现了 静态代理的弊端：
 *      1、代码臃肿 可读性差
 *      2、代码 扩展性差
 *      3、代码 维护性差
 *
 *
 * 静态代理 ：只要后续多出来一种行业
 *      就要继承一个接口
 *      就要维护一个成员属性 目标对象
 *      就要修改代码 重写接口的方法实现接口逻辑
 *
 * 而动态代理就解决了这种现象，将目标对象设置成Object类型，为每一个行业接口生产一个 代理对象，可以理解为一个行业（接口）对应一个代理对象（proxy）  一对一 关系；
 * 不像静态代理， 一个proxy(StaticProxy) 代理多种行业（接口）， 一对多关系；
 */

public class DynamicProxy implements InvocationHandler {

    /**
     * 为什么使用Object ?
     * 对多个接口（对不同领域）做代理
     *     1、汽车行业领域（接口）、手机行业领域（接口）、电脑行业领域（接口）、保险行业领域（接口） .......等等
     */
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 动态代理
     * Proxy.newProxyInstance“只负责为各个行业（接口）创建代理对象（$Proxy0,$Proxy1,$Proxy2 ...）”，接口-代理对象  一对一
     * 解决了静态代理 一个代理对象（proxy）对应多个接口
     * @return
     */
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /** 前置增强 **/
        this.before();
        /** 通过反射实现 转发调用业务处理逻辑**/
        Object obj =  method.invoke(target, args);
        /** 后置增强 **/
        this.after();
        return obj;
    }


    private void after() {
        System.out.println("=======after 目标对象代码执行后 增强操逻辑=====");
    }

    private void before() {
        System.out.println("=======before 目标对象代码执行前 增强操逻辑=====");
    }


}
