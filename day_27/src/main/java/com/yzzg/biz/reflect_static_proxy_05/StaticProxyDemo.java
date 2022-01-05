package com.yzzg.biz.reflect_static_proxy_05;

/**
 * 需求：
 * 有个客户想要购买汽车 自己逛自己找太麻烦，
 * 想要找个代理商去帮他购买 ，
 * 客户心里已经有了几个商家的汽车 ；红旗、大众、奔驰、宝马
 *  分析：从具体到抽象 ；
 *  实现：从抽象到具体
 *
 *  大致分析：
 *  1、根据关键字 名词 : 有客户  代理商  商家
 *  2、客户 可以看成测试类StaticProxyDemo
 *  3、代理商充当代理的角色  是对 商家做代理
 *  4、商家 又分好多（有红旗厂商、大众厂商、奔驰厂商、宝马厂商 等） 他们都有卖车功能；
 *
 *  下面第一种使用静态代理  实现
 *  1、首先创建对 商家的抽象方法 接口
 *  2、
 */
public class StaticProxyDemo {
    public static void main(String[] args) {
        // 静态代理 （手动创建对象）
//        Automaker automaker = new CarProxy();
//        automaker.sellCar();
        Automaker automaker = new CarProxy02(new HongQiCarAutomaker());
        automaker.sellCar();
    }
}
