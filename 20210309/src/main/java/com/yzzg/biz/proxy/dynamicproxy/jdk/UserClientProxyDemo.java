package com.yzzg.biz.proxy.dynamicproxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @author liuyaguang
 */
public class UserClientProxyDemo {
    public static void main(String[] args) {
        // 1. 先有 要被代理的目标 对象
        Provider targerObject = new DaZhongCarProderImpl();
        // 2. 将目标对象注册到 代理公司
        ProxyCompany proxyCompany = new ProxyCompany(targerObject);
        // 3. 为用户分配一个代理人（代理对象）参照/绑定一位 代理公司统一规范标准
        Provider newProxy = (Provider) Proxy.newProxyInstance(targerObject.getClass().getClassLoader(), targerObject.getClass().getInterfaces(), proxyCompany);
        newProxy.produce();
        System.out.println("======================================");
        // ====有了新业务 手机代理==
        Phone phone = new HuaweiPhoneImpl();
        ProxyCompany proxyCompany1 = new ProxyCompany(phone);
        Phone phone1 = (Phone) Proxy.newProxyInstance(phone.getClass().getClassLoader(),phone.getClass().getInterfaces(),proxyCompany1);
        phone1.sale();

    }
}
