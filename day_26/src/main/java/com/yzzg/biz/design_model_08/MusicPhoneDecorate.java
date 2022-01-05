package com.yzzg.biz.design_model_08;

public class MusicPhoneDecorate extends PhoneDecorate{
    // 父类显示定义构造方法 ，只有一个带参构造，所以这里必须要显示调用父类构造器
    public MusicPhoneDecorate(Phone phone) {
        super(phone);
    }

    @Override
    public void call() {
        super.call();
        // 打完电话 听听歌
        System.out.println("手机可以听听歌");
    }
}
