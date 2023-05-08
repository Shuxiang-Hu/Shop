package com.shuxiang.Factory;

import com.shuxiang.UserDao;
import com.shuxiang.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
