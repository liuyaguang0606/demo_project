package com.yzzg.biz.proxy.dynamicproxy.jdk;

public class ApplePhoneImpl implements Phone{
    @Override
    public void sale() {
        System.out.println("ApplePhoneImpl...售卖苹果手机制造商....");
    }

    @Override
    public void call() {
        System.out.println("ApplePhoneImpl...苹果手机call....");
    }
}
