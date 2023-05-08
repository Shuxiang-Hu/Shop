package com.shuxiang.Factory;

import com.shuxiang.UserDao;
import org.springframework.beans.factory.FactoryBean;
import com.shuxiang.UserDaoImpl;

public class UserDaoFactoryBean implements FactoryBean<UserDao> { //代替原始实例工厂中创建对象的方法
     public UserDao getObject() throws Exception {
         return new UserDaoImpl();
     }
     //返回所创建类的Class对象
    public Class<?> getObjectType() {
         return UserDao.class;
     }

}