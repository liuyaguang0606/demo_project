package com.yzzg.biz.reflect_dynamic_proxy_06;


public class HongQiCarAutomaker implements Automaker {

    @Override
    public void sellCar() {
        System.out.println("红旗制造商sellCar");
    }
}
