package com.yzzg.biz.singleton;

/**
 * @PackageName:com.yzzg.biz.singleton
 * @ClassName:SingletonDemo
 * @Description:懒汉式-线程不安全f
 * @Author:lyg
 * @Date:2022/8/5 22:19
 */
public class LazyUnsafeSingleton {
  /**@Desr 实例对象本身 ,成员属性私有化,只能通过方法对它访问*/
  private static LazyUnsafeSingleton instance;
  /**构造对象私有化**/
  private LazyUnsafeSingleton(){
  }

  /**
    * @Desr 为什么双重检查？
    **/
  public static LazyUnsafeSingleton getInstance() {
    if (instance == null) {
      // 如果这里并发多个线程,有个线程创建完释放锁，第二线程在里面不判断的话有可能多次创建对象
      synchronized (LazyUnsafeSingleton.class) {
        if (instance == null) {
          instance = new LazyUnsafeSingleton();
          return instance;
        }
      }
    }
    return instance;
  }
}
