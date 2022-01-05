package com.yzzg.biz.reflect_factory_04;

public class BaoMaStore implements Automaker {
    @Override
    public void sale() {
        System.out.println("这里是销售宝马 4S ");
    }
}
