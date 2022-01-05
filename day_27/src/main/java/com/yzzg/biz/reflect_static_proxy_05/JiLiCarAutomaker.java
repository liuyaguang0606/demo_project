package com.yzzg.biz.reflect_static_proxy_05;

public class JiLiCarAutomaker implements Automaker {
    @Override
    public boolean sellCar() {
        System.out.println("吉利制造商sellCar");
        return false;
    }
}
