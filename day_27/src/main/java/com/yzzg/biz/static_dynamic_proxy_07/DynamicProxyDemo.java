package com.yzzg.biz.static_dynamic_proxy_07;


import com.yzzg.biz.static_dynamic_proxy_07.automaker.impl.ChinaHongQiCarAutomaker;
import com.yzzg.biz.static_dynamic_proxy_07.phone.impl.ApplePhone;

public class DynamicProxyDemo {
    public static void main(String[] args) {
        /**
         * 实现 InvocationHandler 接口
         */
        DynamicProxy dynamicProxy = new DynamicProxy();


        /**
         * 1、对汽车域做动态代理    然后再对手机做代理  代理对象代码不需要任何调整
         */
        Automaker automaker = new ChinaHongQiCarAutomaker();
        dynamicProxy.setTarget(automaker);
        // 获取代理对象
        Automaker proxy1 = (Automaker) dynamicProxy.getProxyInstance();
        proxy1.produce();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        /**
         * 2、手机行业领域    做代理
         */
        Phone phone = new ApplePhone();
        dynamicProxy.setTarget(phone);
        // 获取不同的 代理对象
        Phone proxy2 = (Phone) dynamicProxy.getProxyInstance();
        proxy2.call();

        /**
         * 3、对电脑行业领域  做代理
         */

        /**
         * 4、对保险行业领域  做代理
         */

    }
}
