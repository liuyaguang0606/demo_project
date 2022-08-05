package com.yzzg.biz.singleton;

/**
 * @PackageName:com.yzzg.biz.singleton
 * @ClassName:HungrySafeSingleton
 * @Description:饿汉式-线程安全
 * 基于 classloader 机制避免了多线程的同步问题，instance 在类装载时就实例化
 * @Author:lyg
 * @Date:2022/8/5 22:38
 */
public class HungrySafeSingleton {
  /**私有成员属性,提供方法修改*/
  private volatile static HungrySafeSingleton instance = new HungrySafeSingleton();
  /**私有构造方法*/
  private HungrySafeSingleton(){}

  public static HungrySafeSingleton getInstance() {
    return instance;
  }

}
