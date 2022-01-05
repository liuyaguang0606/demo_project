package com.yzzg.biz.static_dynamic_proxy_07;

/**
 * 汽车制造商
 *  1、抽象
 *  1、日本本田汽车制造商
 *  2、中国红旗汽车制造商
 *  3、德国奔驰汽车制造商
 *  。。。 后续 新产生的汽车制造商做代理
 */
public interface Automaker {

    /**
     * 都有生产制造功能
     */
    public abstract void produce();

}
