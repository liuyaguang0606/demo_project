package com.yzzg.biz.singleton;

/**
 * @PackageName:com.yzzg.biz.singleton
 * @ClassName:HungryEnumSingleton
 * @Description:饿汉式-枚举实现-线程安全
 * 自动支持序列化机制，绝对防止多次实例化，避免多线程同步问题
 * @Author:lyg
 * @Date:2022/8/5 22:52
 */

public class HungryEnumSingleton {


  private HungryEnumSingleton() {  }

  private static HungryEnumSingleton getInstance() {
    return HungryEnum.INSTANCE.getInstance();
  }


  /**内部枚举*/
  public enum HungryEnum {

    INSTANCE;

    private final HungryEnumSingleton instance;

    /**默认私有的 只能在类加载时被初始化一次*/
    HungryEnum() {
      instance = new HungryEnumSingleton();
    }

    private HungryEnumSingleton getInstance() {
      return instance;
    }

  }

}