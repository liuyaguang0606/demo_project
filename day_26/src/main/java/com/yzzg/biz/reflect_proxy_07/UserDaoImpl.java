package com.yzzg.biz.reflect_proxy_07;

public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("用户添加功能");
    }

    @Override
    public void delete() {
        System.out.println("用户删除功能");
    }

    @Override
    public void update() {
        System.out.println("用户更新功能");
    }

    @Override
    public void find() {
        System.out.println("用户查询功能");
    }
}
