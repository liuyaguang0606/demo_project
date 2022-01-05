package com.yzzg.biz.static_dynamic_proxy_07.automaker.impl;

import com.yzzg.biz.static_dynamic_proxy_07.Automaker;

public class JapanBenTianCarAutomaker implements Automaker {
    @Override
    public void produce() {
        System.out.println("日本本田汽车制造");
    }
}
