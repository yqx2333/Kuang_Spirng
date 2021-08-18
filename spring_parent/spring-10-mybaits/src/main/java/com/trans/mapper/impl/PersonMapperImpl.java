package com.trans.mapper.impl;

import com.trans.mapper.UserMapper;
import com.trans.pojo.User;
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
