package com.yzzg.biz.reflect_proxy_07;

import java.lang.reflect.Proxy;

public class DynamicProxyDemo {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        userDao.add();
        System.out.println("=====================");

        /**
         * MyInvocationHandler : 可以理解为是个“代理公司”;
         * Proxy.newProxyInstance() : 可以理解为 代理公司为每一种业务或接口（代购汽车业务（接口）、代购手机业务（接口）、代购...）,产生一个专业业务领域的服务人员（代理对象/代理人）;
         * InvocationHandler : 可以理解为是每个代理公司统一制定的规范（接口）; 是为Proxy 生产的专业人员(代理对象)操作流程规范（就是按照invoke流程规范操作）;
         * UserDao : 可以理解为 实际的要被代理的目标接口对象;
         * 大致流程可以这样理解：
         *      当客户端（客户）要使用目标接口对象时,不是直接去使用,而是通过代理公司对象使用;
         *      相对于客户端来说 目标接口对象是被代理公司管理，目标对象首先要将自己的资源注册到代理公司
         *          注册：MyInvocationHandler handler = new MyInvocationHandler(userDao)
         *       然后Proxy.newProxyInstance 分配或者创建一个代理人（代理对象）提供给客户端使用;当然这个代理人要按照一定的标准来分配或者创建什么标准？
         *          分配的标准：
         *              userDao.getClass().getClassLoader() : 代理对象要和目标对象userDao同属一个类加载器
         *              userDao.getClass().getInterfaces() ： 代理对象要和目标对象userDao同属一个接口
         *              handler  ： 并且代理对象要知道（按照）代理公司的规范（实现了InvocationHandler接口的类）业务操作
         *
         */
        MyInvocationHandler handler = new MyInvocationHandler(userDao);
        UserDao userDaoProxy = (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), handler);
        userDaoProxy.add();
        userDaoProxy.delete();
        userDaoProxy.update();
        userDaoProxy.find();

    }
}
