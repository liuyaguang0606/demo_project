package com.yzzg.biz.reflect_dynamic_proxy_06;

public class BaoMaCarAutomaker implements Automaker {
    @Override
    public void sellCar() {
        System.out.println("宝马制造商sellCar");
    }
}
