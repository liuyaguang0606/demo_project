package com.yzzg.biz.reflect_static_proxy_05;

public class BaoMaCarAutomaker implements Automaker {
    @Override
    public boolean sellCar() {
        System.out.println("宝马制造商sellCar");
        return false;
    }
}
