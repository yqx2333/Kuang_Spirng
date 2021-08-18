package com.trans.kuang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fanzx
 * @create 2021/8/17 15:10
 */
public class UserServiceTest {

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 动态代理代理的是接口 而不是实现类
        UserService bean = context.getBean("userService",UserService.class);
        bean.add();
    }

}
