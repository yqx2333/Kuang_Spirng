package com.trans.config;

import com.trans.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author fanzx
 * @create 2021/8/13 15:09
 */
@Configuration
@ComponentScan("com.trans")
public class BeansConfig {
    @Bean
    public User getUser(){
        return new User("张三");
    }
}
