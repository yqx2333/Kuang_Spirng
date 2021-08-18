package com.trans.dao.impl;

import com.trans.dao.UserDao;

/**
 * @author fanzx
 * @create 2021/8/10 15:10
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("获取用户的数据");
    }
}
