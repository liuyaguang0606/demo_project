package com.yzzg.biz.static_dynamic_proxy_07.phone.impl;

import com.yzzg.biz.static_dynamic_proxy_07.Phone;

public class ApplePhone implements Phone {
    @Override
    public void call() {
        System.out.println("使用苹果手机打电话");
    }
}
