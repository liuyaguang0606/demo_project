package com.yzzg.biz.reflect_proxy_07;

public class StudentDaoImpl implements StudentDao {
    @Override
    public void login() {
        System.out.println("登录功能");
    }

    @Override
    public void regist() {
        System.out.println("注册功能");
    }
}
