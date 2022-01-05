package com.yzzg.biz.cglib_proxy_implclass_08;

public class CglibProxyDemo {
    public static void main(String[] args) {
        //
        TargetCglibProxy proxy = new TargetCglibProxy();
        TargetInterfaceImpl targetInterfaceImpl = proxy.getTargetProxy(TargetInterfaceImpl.class);
        String ss = targetInterfaceImpl.sayHello("haha");
        System.out.println("ss : " + ss);
    }

}
