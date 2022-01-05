package com.yzzg.biz.proxy.staticproxy.phone;

public class HuaWeiPhoneProvider implements PhoneProvider {
    @Override
    public void call() {
        System.out.println("HuaWeiPhoneProvider...生产华为手机。。。。");
    }
}
