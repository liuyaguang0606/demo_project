package com.yzzg.biz.proxy.staticproxy;

import com.yzzg.biz.proxy.staticproxy.car.CarProvider;
import com.yzzg.biz.proxy.staticproxy.car.HongQiProderImpl;
import com.yzzg.biz.proxy.staticproxy.phone.HuaWeiPhoneProvider;
import com.yzzg.biz.proxy.staticproxy.phone.PhoneProvider;

public class StaticProxyObjectDemo {
    public static void main(String[] args) {
        // ==========对汽车做代理===========
        // 被代理对象(目标对象)
        CarProvider carProvider = new HongQiProderImpl();
        // 目标对象传入 代理类中
        StaticProxyObject carPorxy = new StaticProxyObject(carProvider);
        carPorxy.produce();

        // ======对手机做代理==============
        // 被代理对象(目标对象)
        PhoneProvider phoneProvider  = new HuaWeiPhoneProvider();
        // 目标对象传入 代理类中
        StaticProxyObject phonePorxy = new StaticProxyObject(phoneProvider);
        phonePorxy.call();



    }
}
