package com.yzzg.biz.reflect_static_proxy_05;

public class HongQiCarAutomaker implements Automaker {
    @Override
    public boolean sellCar() {
        System.out.println("红旗制造商sellCar");
        return false;
    }
}
