package com.yqx.mapper;

import com.yqx.pojo.User;
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
