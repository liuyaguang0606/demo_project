package com.yzzg.biz.static_dynamic_proxy_07;

/**
 * 假设还没出现手机代理时 只对汽车做代理 直接继承汽车接口；后续代理公司发展多元化对各个行业做代理，出现好多被代理接口
 * 后面出现 对手机行业做代理
 * 又出现对 对电脑行业做代理
 * 又出现对 对保险行业做代理，等等
 *  -- 解决要实现电脑抽象接口、保险抽象接口 还要把代理的目标对象包含到代理对象里面等
 * 这是就体现了 静态代理的弊端：
 *      1、代码臃肿 可读性差
 *      2、代码 扩展性差
 *      3、代码 维护性差
 *
 *
 * 静态代理 ：只要后续多出来一种行业
 *      就要继承一个接口
 *      就要维护一个成员属性 目标对象
 *      就要修改代码 重写接口的方法实现接口逻辑
 *
 * 而动态代理就解决了这种现象，将目标对象设置成Object类型，为每一个行业接口生产一个 代理对象，可以理解为一个行业（接口）对应一个代理对象（proxy）  一对一 关系；
 * 不像静态代理， 一个proxy(StaticProxy) 代理多种行业（接口）， 一对多关系；
 */
public class StaticProxy implements Automaker, Phone{

    /** 被代理的目标对象 **/
    /** 代理 汽车行业 目标对象 **/
    private Automaker automaker;
    /** 代理 手机行业 目标对象 **/
    private Phone phone;
    /** 代理 电脑行业 目标对象 **/
    /** 代理 保险行业 目标对象**/


    public void setAutomaker(Automaker automaker) {
        this.automaker = automaker;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    private void after() {
        System.out.println("=======after 目标对象代码执行后 增强操逻辑=====");
    }

    private void before() {
        System.out.println("=======before 目标对象代码执行前 增强操逻辑=====");
    }
    /**
     * 1、对汽车做代理 实现覆写的方法
     */
    @Override
    public void produce() {
        // 调用前增强业务
        this.before();
        this.automaker.produce();
        // 调用后增强业务
        this.after();
    }

    /**
     * 2、对手机 做代理
     */
    @Override
    public void call() {
        // 调用前增强业务
        this.before();
        this.phone.call();
        // 调用后增强业务
        this.after();
    }

    /**
     * 3、对电脑行业 做代理
     */

    /**
     * 4、对 保险行业 做代理
     */


}
