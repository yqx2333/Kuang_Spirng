package com.trans.mapper;

import com.trans.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author fanzx
 * @create 2021/8/18 10:35
 */
public class UserMapperTwo extends SqlSessionDaoSupport implements UserMapper{

    @Override
    public List<User> selectUser() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        mapper.addUser(new User(null,"23423423432","23423423432"));
        mapper.deleteUser(2);
        return mapper.selectUser();
        // return getSqlSession().getMapper(UserMapper.class).selectUser();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(Integer id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
