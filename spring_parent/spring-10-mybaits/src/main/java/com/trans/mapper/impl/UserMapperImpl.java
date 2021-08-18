package com.trans.mapper.impl;

import com.trans.mapper.UserMapper;
import com.trans.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author fanzx
 * @create 2021/8/17 17:08
 */
public class UserMapperImpl implements UserMapper {

    /*
    我们现在所有的操作 都是用SqlSessionTemplate
     */
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User> select() {
        return sqlSessionTemplate.getMapper(UserMapper.class).select();
    }
}
