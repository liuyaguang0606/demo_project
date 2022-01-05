package com.yzzg.biz.reflect_factory_04;

public class HongQiStore implements Automaker{
    @Override
    public void sale() {
        System.out.println("这里是销售红旗汽车4S店");
    }
}
