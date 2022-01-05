package com.yzzg.biz.cglib_proxy_interface_09;

public class TargetCglibDemo {
    public static void main(String[] args) {
        TargetCglibProxy proxy = new TargetCglibProxy();
        TargetInterface target = proxy.getCglibProxy(TargetInterface.class);
        String ss = target.sayHelle("haha");
        System.out.println(ss);



    }
}
