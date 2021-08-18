package com.trans.mapper;

import com.trans.pojo.User;

import java.util.List;

/**
 * @author fanzx
 * @create 2021/8/18 10:04
 */
public interface UserMapper {

    List<User> selectUser();

    int addUser(User user);

    int deleteUser(Integer id);

}
