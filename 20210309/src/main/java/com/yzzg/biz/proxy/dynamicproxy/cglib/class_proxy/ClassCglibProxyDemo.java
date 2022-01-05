package com.yzzg.biz.proxy.dynamicproxy.cglib.class_proxy;


import com.yzzg.biz.proxy.dynamicproxy.cglib.interface_proxy.InterfaceCglibProxyCompany;

public class ClassCglibProxyDemo {
    public static void main(String[] args) {
        XiaoMiPhoneImpl xiaoMiPhone = new XiaoMiPhoneImpl();
        ClassCglibProxyCompany proxyCompany = new ClassCglibProxyCompany(xiaoMiPhone);
        XiaoMiPhoneImpl targerProxy = (XiaoMiPhoneImpl) proxyCompany.getTargerProxy(xiaoMiPhone);
        targerProxy.xiaomi();
    }
}
