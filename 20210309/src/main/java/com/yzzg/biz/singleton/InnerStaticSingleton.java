package com.yzzg.biz.singleton;

/**
 * @PackageName:com.yzzg.biz.singleton
 * @ClassName:InnerStaticSingleton
 * @Description:懒汉式-静态内部类-线程安全
 * 因为 SingletonHolder 类没有被主动使用，只有通过显示调用getInstance 方法时，才会显示装载 SingletonHolder
 * @Author:lyg
 * @Date:2022/8/5 22:45
 */
public class InnerStaticSingleton {

  private InnerStaticSingleton(){

  }

  /**通过引入静态内部类holer来避免之前介绍的，一加载就初始化的问题*/
  private static class SingletonHolder{
    private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
  }

  public static final InnerStaticSingleton getInstance() {
    return SingletonHolder.INSTANCE;
  }

}
