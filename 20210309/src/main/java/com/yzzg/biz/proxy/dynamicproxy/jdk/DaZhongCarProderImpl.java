package com.yzzg.biz.proxy.dynamicproxy.jdk;

public class DaZhongCarProderImpl implements Provider{
    @Override
    public void produce() {
        System.out.println("DaZhongCarProderImpl...生产大众汽车提供商......");
    }
}
