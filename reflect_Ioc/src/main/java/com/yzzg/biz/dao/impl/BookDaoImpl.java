package com.yzzg.biz.dao.impl;

import com.yzzg.biz.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void read() {
        System.out.println("读书");
    }
}
