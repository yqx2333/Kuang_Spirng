package com.trans.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fanzx
 * @create 2021/8/13 11:19
 */
public class PeopleTest {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("autowired.xml");
        People people = context.getBean("people", People.class);
        people.getCat().shout();
        people.getDog().shout();
    }

}
