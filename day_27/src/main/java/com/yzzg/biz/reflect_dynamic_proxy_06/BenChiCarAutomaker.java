package com.yzzg.biz.reflect_dynamic_proxy_06;


public class BenChiCarAutomaker implements Automaker {
    @Override
    public void sellCar() {
        System.out.println("奔驰制造商sellCar");
    }
}
