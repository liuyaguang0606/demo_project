package com.yzzg.biz.proxy.staticproxy.phone;

public class ApplePhoneProviderImpl implements PhoneProvider{
    @Override
    public void call() {
        System.out.println("ApplePhoneProviderImpl.....生产苹果手机....");
    }
}
