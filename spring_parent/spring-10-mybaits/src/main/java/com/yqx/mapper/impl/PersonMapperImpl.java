package com.yqx.mapper.impl;

import com.yqx.mapper.UserMapper;
import com.yqx.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author fanzx
 * @create 2021/8/17 18:15
 */
public class PersonMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> select() {
        return getSqlSession().getMapper(UserMapper.class).select();
    }
}
