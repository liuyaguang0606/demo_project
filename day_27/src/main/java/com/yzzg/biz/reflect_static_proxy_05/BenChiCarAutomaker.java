package com.yzzg.biz.reflect_static_proxy_05;

public class BenChiCarAutomaker implements Automaker {
    @Override
    public boolean sellCar() {
        System.out.println("奔驰制造商sellCar");
        return false;
    }
}
