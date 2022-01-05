package com.yzzg.biz.cglib_proxy_implclass_08;

public class TargetInterfaceImpl implements TargetInterface {
    @Override
    public String sayHello(String name) {
        return "helle," + name;
    }

    @Override
    public String sayThinks(String name) {
        return "thinks," + name;
    }
}
