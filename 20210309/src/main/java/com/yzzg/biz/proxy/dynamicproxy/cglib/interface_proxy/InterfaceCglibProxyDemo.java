package com.yzzg.biz.proxy.dynamicproxy.cglib.interface_proxy;

public class InterfaceCglibProxyDemo {
    public static void main(String[] args) {

        InterfaceCglibProxyCompany proxyCompany = new InterfaceCglibProxyCompany();
        Phone targerProxy = (Phone) proxyCompany.getTargerProxy(Phone.class);
        String print = targerProxy.print();
        System.out.println(print);


    }
}
