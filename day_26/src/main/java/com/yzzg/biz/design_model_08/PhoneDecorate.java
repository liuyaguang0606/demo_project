package com.yzzg.biz.design_model_08;

/**
 * 抽象的手机装饰类
 *  1、对要装饰的这一类手机(不光是iPhone 这款手机 后面华为等) ,也是为什么不用继承 而是用装饰设计模式代替继承;
 *  2、继承 是IPhone继承装饰类， 装饰设计的思想是将要装饰的  传进来
 */
public abstract class PhoneDecorate implements Phone{
    private Phone phone;

    // 没定义空构造函数

    public PhoneDecorate(Phone phone){
        this.phone = phone;
    }


    @Override
    public void call() {
        this.phone.call();
    }
}
