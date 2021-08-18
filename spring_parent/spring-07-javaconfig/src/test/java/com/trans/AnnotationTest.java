package com.trans;

import com.trans.config.BeansConfig;
import com.trans.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author fanzx
 * @create 2021/8/13 15:16
 */
public class AnnotationTest {

    @Test
    public void Test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser);
    }

}
