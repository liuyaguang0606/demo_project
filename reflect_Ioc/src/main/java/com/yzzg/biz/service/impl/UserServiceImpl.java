package com.yzzg.biz.service.impl;

import com.yzzg.biz.dao.UserDao;
import com.yzzg.biz.dao.impl.UserDaoImpl;
import com.yzzg.biz.pojo.User;
import com.yzzg.biz.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();



    @Override
    public User getUser() {
        userDao.study();
        return null;
    }
}
