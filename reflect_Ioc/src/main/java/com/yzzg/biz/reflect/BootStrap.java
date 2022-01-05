package com.yzzg.biz.reflect;

import com.yzzg.biz.dao.UserDao;

import java.io.IOException;

/**
 * 启动类
 */
public class BootStrap {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {

        // 初始化bean
        ApplicationContext ac = new ApplicationContext();
        ac.initContext();

        //
        System.out.println(ac.getBean(UserDao.class));
    }
}
