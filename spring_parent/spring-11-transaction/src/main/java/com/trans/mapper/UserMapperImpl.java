package com.trans.mapper;

import com.trans.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author fanzx
 * @create 2021/8/18 10:12
 */
public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }


    @Override
    public List<User> selectUser() {
        //return this.sqlSessionTemplate.getMapper(UserMapper.class).selectUser();
        UserMapper mapper = this.sqlSessionTemplate.getMapper(UserMapper.class);
        mapper.selectUser().forEach(System.out::println);
        return mapper.selectUser();
    }
}
