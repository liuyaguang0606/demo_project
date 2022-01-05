package com.yzzg.biz.design_model_08;

public class RingPhoneDecorate extends PhoneDecorate{

    public RingPhoneDecorate(Phone phone) {
        super(phone);
    }

    //覆写父类方法
    @Override
    public void call() {
        System.out.println("手机可以听彩铃");
        super.call();
    }

}
