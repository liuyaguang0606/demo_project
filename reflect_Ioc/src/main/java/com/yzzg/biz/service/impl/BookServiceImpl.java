package com.yzzg.biz.service.impl;

import com.yzzg.biz.dao.BookDao;
import com.yzzg.biz.dao.UserDao;
import com.yzzg.biz.dao.impl.BookDaoImpl;
import com.yzzg.biz.dao.impl.UserDaoImpl;
import com.yzzg.biz.pojo.Book;
import com.yzzg.biz.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao = new BookDaoImpl();
    private UserDao userDao = new UserDaoImpl();


    @Override
    public Book getBook() {
         bookDao.read();
        return null;
    }
}
