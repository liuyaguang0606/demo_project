package com.yzzg.biz.design_model_08;

public class IPhone implements Phone{
    @Override
    public void call() {
        System.out.println("<<打电话功能>>");
    }
}
