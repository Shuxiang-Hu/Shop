package com.shuxiang;

import com.shuxiang.Service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) { //获取IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
//        OrderDao orderDao = (OrderDao) ctx.getBean("orderDao");
//        orderDao.save();
//        UserDao userDao = (UserDao) ctx.getBean("userDao");
//        userDao.save();
    }
}
