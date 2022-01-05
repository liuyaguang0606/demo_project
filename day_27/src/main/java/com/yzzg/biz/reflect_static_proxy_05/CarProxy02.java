package com.yzzg.biz.reflect_static_proxy_05;

/**
 * 汽车制造商/生产商 代理类
 * 对 所有制造商做代理
 *
 */
public class CarProxy02 implements Automaker {
    // 被代理的目标制造商 对象
    private Automaker targer;

    public CarProxy02(Automaker targer){
        this.targer = targer;
    }
    /**
     * 执行具体业务执行前 调用该方法
     * @return
     */
    public void beforeSellCar(){
        System.out.println("======取消掉JDBC的自动提交  cancle方法======");
    }

    @Override
    public boolean sellCar() {
        try {
            System.out.println("== before对任意制造商做代理之前业务操作 ==");
            this.beforeSellCar();

            boolean flage = targer.sellCar();

            System.out.println("== after对任意制造商做代理之前业务操作 ==");
            this.afterSellerCar();
            return true;
        }catch (Exception e) {
            this.rollback();
            return false;
        }
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

}
