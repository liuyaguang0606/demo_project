package com.yzzg.biz.design_model_08;

public class IPhoneDemo {
    public static void main(String[] args) {
        Phone p = new IPhone();
        p.call();
        System.out.println("-----------------------------");

        // 装饰设计模式
        // 对手机 装饰增强功能，增加打电话前听彩铃
        PhoneDecorate pd = new RingPhoneDecorate(p);
        pd.call();
        System.out.println("----------------------");

        // 对手机 装饰增强功能，增加打电话后听听歌
        PhoneDecorate pd2 = new MusicPhoneDecorate(p);
        pd2.call();
        System.out.println("------------------------------------");
        //打电话后看电视
        PhoneDecorate pd3 = new VideoPhoneDecorate(p);
        pd3.call();

    }
}
