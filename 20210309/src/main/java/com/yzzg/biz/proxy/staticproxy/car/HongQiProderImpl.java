package com.yzzg.biz.proxy.staticproxy.car;

import com.yzzg.biz.proxy.staticproxy.car.CarProvider;

public class HongQiProderImpl implements CarProvider {
    @Override
    public void produce() {
        System.out.println("HongQiProderImpl ....业务处理");
    }
}
