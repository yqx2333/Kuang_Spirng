package com.yqx.controller;

import com.yqx.service.BooksService;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fanzx
 * @create 2021/8/20 14:37
 */
public class BooksControllerTest extends TestCase {

    @Test
    public void test1(){
        // ApplicationContext context = new ClassPathXmlApplicationContext("spring-service.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BooksService booksServiceImpl = context.getBean("booksService", BooksService.class);
        System.out.println(booksServiceImpl.selectAll());
    }

}