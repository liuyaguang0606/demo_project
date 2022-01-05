package com.yzzg.biz.reflect_static_proxy_05;

/**
 * 汽车制造商/生产商 代理类
 * 对 所有制造商做代理
 *
 */
public class CarProxy implements Automaker {
    // 被代理的目标制造商 对象
    private Automaker targer;



    @Override
    public boolean sellCar() {
        System.out.println("== before对任意制造商做代理之前业务操作 ==");
        // 静态代理
        if (targer == null) {
            // 这里手动创建对象(不能在程序运行时动态创建对象)
            // targer = new BaoMaCarAutomaker();
            // targer = new BenChiCarAutomaker();
            // targer = new JiLiCarAutomaker();
            targer = new HongQiCarAutomaker();
        }
        targer.sellCar();
        System.out.println("== after对任意制造商做代理之前业务操作 ==");
        return false;
    }



}
