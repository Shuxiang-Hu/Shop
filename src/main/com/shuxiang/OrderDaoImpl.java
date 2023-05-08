package com.shuxiang;

public class OrderDaoImpl implements OrderDao{
    @Override
    public void save() {
        System.out.println("OrderDao saving");
    }
}
