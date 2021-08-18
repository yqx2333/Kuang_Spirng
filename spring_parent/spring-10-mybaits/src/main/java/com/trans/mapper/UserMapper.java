package com.trans.mapper;

import com.trans.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fanzx
 * @create 2021/8/17 16:42
 */
@Repository
public interface UserMapper {

    List<User> select();

}
