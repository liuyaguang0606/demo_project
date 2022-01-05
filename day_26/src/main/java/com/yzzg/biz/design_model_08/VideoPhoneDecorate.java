package com.yzzg.biz.design_model_08;

public class VideoPhoneDecorate extends PhoneDecorate{
    public VideoPhoneDecorate(Phone phone) {
        super(phone);
    }

    @Override
    public void call() {
        super.call();
        // 打电话后看电视
        System.out.println("--看电视--");
    }
}
