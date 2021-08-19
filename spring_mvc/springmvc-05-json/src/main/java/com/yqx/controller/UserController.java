package com.yqx.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.yqx.pojo.User;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author fanzx
 * @create 2021/8/19 16:23
 */
@Controller
public class UserController {

    @SneakyThrows
    @ResponseBody   // 使用该注解后 不会走视图解析器,会直接返回一个字符串
    // @RequestMapping(value = "/json1",produces = "application/json;charset=utf-8")
    @RequestMapping("json1")
    public String json1(){
        //Jackson
        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User("张三", 123, "未知");
        String string = objectMapper.writeValueAsString(user);
        return string;
    }

    @SneakyThrows
    @ResponseBody
    @RequestMapping("json2")
    public String json2(){
        //Jackson
        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User("张三", 123, "未知");
        User user1 = new User("张三", 123, "未知");
        User user2 = new User("张三", 123, "未知");
        User user3 = new User("张三", 123, "未知");
        User user4 = new User("张三", 123, "未知");
        List<User> users = Arrays.asList(user1, user2, user3, user4);
        String string = objectMapper.writeValueAsString(users);
        return string;
    }

    @SneakyThrows
    @ResponseBody
    @RequestMapping("json3")
    public String json3(){
        // 使用纯Java去解决
        // ObjectMapper时间解析后的默认格式为: TimeStomp
        // SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // return new ObjectMapper().writeValueAsString(simpleDateFormat.format(new Date()));

        // 使用ObjectMapper解决时间
        ObjectMapper mapper = new ObjectMapper();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 不适用时间戳格式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        // 将时间格式放入到mapper中
        mapper.setDateFormat(simpleDateFormat);
        return mapper.writeValueAsString(new Date());
    }
}
