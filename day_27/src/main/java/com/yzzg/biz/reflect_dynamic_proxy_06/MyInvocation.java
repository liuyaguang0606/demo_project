package com.yzzg.biz.reflect_dynamic_proxy_06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocation implements InvocationHandler {
    // 要代理的 目标对象 奔驰 宝马 红旗 吉利等
    // 被代理的真是对象
    private Automaker target;

    // 通过构造方法对 目标对象初始化
    public MyInvocation(Automaker target) {
        this.target = target;
    }


    /**
     * 执行具体业务执行前 调用该方法
     * @return
     */
    public void beforeSellCar(){
        System.out.println("======取消掉JDBC的自动提交  cancle方法======");
    }
    /**
     * 执行具体业务执行hou 调用该方法
     */
    public void afterSellerCar(){
        System.out.println("=======afterSellCar======");
    }
    /**
     * 异常取消回滚操作
     */
    private void rollback() {
        System.out.println("=====回滚操作=====");
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = null;
        try {
            System.out.println("== before对任意制造商做代理之前业务操作 ==");
            this.beforeSellCar();

            object = method.invoke(target, args);

            System.out.println("== after对任意制造商做代理之前业务操作 ==");
            this.afterSellerCar();
            return object;
        }catch (Exception e) {
            this.rollback();
            return object;
        }

    }
}
