package com.yqx.config;

import com.yqx.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author fanzx
 * @create 2021/8/13 15:09
 */
@Configuration
@ComponentScan("com.yqx")
public class BeansConfig {
    @Bean
    public User getUser(){
        return new User("张三");
    }
}
