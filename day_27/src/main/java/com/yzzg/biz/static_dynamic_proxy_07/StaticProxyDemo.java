package com.yzzg.biz.static_dynamic_proxy_07;


import com.yzzg.biz.static_dynamic_proxy_07.automaker.impl.ChinaHongQiCarAutomaker;
import com.yzzg.biz.static_dynamic_proxy_07.automaker.impl.JapanBenTianCarAutomaker;
import com.yzzg.biz.static_dynamic_proxy_07.phone.impl.HuaWeiPhone;

/**
 * 使用静态代理 和动态代理对比
 */
public class StaticProxyDemo {
    public static void main(String[] args) {
        // 对红旗汽车做代理
        ChinaHongQiCarAutomaker hongQiCarAutomaker = new ChinaHongQiCarAutomaker();
        StaticProxy sp = new StaticProxy();
        sp.setAutomaker(hongQiCarAutomaker);
        sp.produce();
        // 对日本本田汽车做代理
        JapanBenTianCarAutomaker benTianCarAutomaker = new JapanBenTianCarAutomaker();
        StaticProxy jpsp = new StaticProxy();
        jpsp.setAutomaker(benTianCarAutomaker);
        jpsp.produce();
        System.out.println("-----------------------------------------");
        // 对新的手机  领域 做代理 ， 代理类实现手机接口
        HuaWeiPhone hw = new HuaWeiPhone();
        StaticProxy staticProxy = new StaticProxy();
        staticProxy.setPhone(hw);
        // 代理类调用代理方法  做转发 给目标对象方法
        staticProxy.call();

    }
}
