package com.yzzg.biz.reflect_factory_04;

public class FactoryDemo {
    public static void main(String[] args) {
//        Automaker hq = new HongQiStore();
//        hq.sale();
        // 使用静态工厂的模式
//        Automaker automaker = CarFactory.getInstance("hongqi");
//        automaker.sale();
//        Automaker automaker = CarFactory.getInstance("dazhong");
//        automaker.sale();

        // 如果对接的4S店很多 这种静态工厂模式就不适用 ，对静态工厂 通过反射 升级改造

        //改进后
        Automaker automaker = DynamicCarFactory.getInstance("com.yzzg.biz.reflect_proxy_04.HongQiStore");
        automaker.sale();

    }
}
