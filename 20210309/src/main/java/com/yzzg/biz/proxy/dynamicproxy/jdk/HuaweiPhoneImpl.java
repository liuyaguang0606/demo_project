package com.yzzg.biz.proxy.dynamicproxy.jdk;

public class HuaweiPhoneImpl implements Phone {
    @Override
    public void sale() {
        System.out.println("HuaweiPhoneImpl...售卖华为手机制造商....");
    }

    @Override
    public void call() {
        System.out.println("HuaweiPhoneImpl...华为手机call...");
    }
}
