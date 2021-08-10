package com.yqx.dao.impl;

import com.yqx.dao.UserDao;

/**
 * @author fanzx
 * @create 2021/8/10 15:10
 */
public class UserMySqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("获取MySql的数据");
    }
}
