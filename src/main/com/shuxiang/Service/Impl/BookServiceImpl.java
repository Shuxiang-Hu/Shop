package com.shuxiang.Service.Impl;

import com.shuxiang.BookDao;
import com.shuxiang.Service.BookService;
import com.shuxiang.UserDao;

public class BookServiceImpl implements BookService {

    private BookDao bookDao ;


    private UserDao userDao;
    public void save() {
        System.out.println("book service save ...");
        userDao.save();
        bookDao.save();

    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    //    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
//        this.bookDao = bookDao;
//        this.userDao = userDao;
//    }
}
