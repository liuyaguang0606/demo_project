package com.yzzg.biz.proxy.dynamicproxy.jdk;

public class BenChiCarProviderImpl implements Provider{
    @Override
    public void produce() {
        System.out.println("BenChiCarProviderImpl...生产奔驰汽车提供商......");
    }
}
