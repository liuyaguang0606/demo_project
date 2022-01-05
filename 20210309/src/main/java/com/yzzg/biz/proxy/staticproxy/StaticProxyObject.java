package com.yzzg.biz.proxy.staticproxy;

import com.yzzg.biz.proxy.staticproxy.car.CarProvider;
import com.yzzg.biz.proxy.staticproxy.phone.PhoneProvider;

public class StaticProxyObject implements CarProvider, PhoneProvider {

    /**
     * 生产汽车业务目标对象
     */
    private CarProvider carProvider;
    /**
     * 生产手机业务目标对象
     */
    private PhoneProvider phoneProvider;


    public StaticProxyObject(CarProvider carProvider) {
        this.carProvider = carProvider;
    }

    public StaticProxyObject(PhoneProvider phoneProvider) {
        this.phoneProvider = phoneProvider;
    }

    public StaticProxyObject() {
    }

    @Override
    public void produce() {
        System.out.println("生产--汽车--静态代理前.....");
        carProvider.produce();
        System.out.println("生产--汽车--静态代理后.....");

    }

    @Override
    public void call() {
        System.out.println("生产<手机>静态代理前.....");
        phoneProvider.call();
        System.out.println("生产<手机>静态代理后.....");
    }
}
