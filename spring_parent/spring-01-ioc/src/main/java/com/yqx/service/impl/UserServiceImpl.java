package com.yqx.service.impl;

import com.yqx.dao.UserDao;
import com.yqx.dao.impl.UserDaoImpl;
import com.yqx.service.UserService;

/**
 * @author fanzx
 * @create 2021/8/10 15:12
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    /**
     * 简单的实现依赖注入, 用户想使用哪个 就调用哪个;
     * @param userDao
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
