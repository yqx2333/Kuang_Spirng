package com.trans.method;

import com.test.method1.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fanzx
 * @create 2021/8/17 15:24
 */
public class MethodTest {

    public static void main(String[] args){

        // Spring原生API 配置Aop测试
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonService personService = context.getBean("personService", PersonService.class);
        personService.query();


    }

}
