package com.yzzg.biz.proxy.staticproxy.car;

import com.yzzg.biz.proxy.staticproxy.car.CarProvider;

public class DaZhongProviderImpl implements CarProvider {
    @Override
    public void produce() {
        System.out.println("DaZhongProviderImpl .... 业务处理.....");
    }
}
