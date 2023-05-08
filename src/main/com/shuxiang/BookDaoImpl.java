package com.shuxiang;

import com.shuxiang.BookDao;

public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("BookDao Saving");
    }
}
