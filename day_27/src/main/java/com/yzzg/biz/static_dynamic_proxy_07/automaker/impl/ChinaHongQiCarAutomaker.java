package com.yzzg.biz.static_dynamic_proxy_07.automaker.impl;

import com.yzzg.biz.static_dynamic_proxy_07.Automaker;

public class ChinaHongQiCarAutomaker implements Automaker {
    @Override
    public void produce() {
        System.out.println("中国生产红旗汽车");
    }
}
