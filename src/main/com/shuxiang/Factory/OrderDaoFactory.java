package com.shuxiang.Factory;

import com.shuxiang.OrderDao;
import com.shuxiang.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        System.out.println("Factory set up");
        return new OrderDaoImpl();

    }
}
