package com.trans.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author fanzx
 * @create 2021/8/17 16:45
 */
public class UserMapperTest {

    @Test
    public void test(){
        String resource = "mybatis-config.xml";
        try {
            InputStream stream = Resources.getResourceAsStream(resource);
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
            SqlSession sqlSession = build.openSession(true);
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            mapper.select().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSpring(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        userMapper.select().forEach(System.out::println);

    }

    @Test
    public void testPerson(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserMapper personMapper = context.getBean("personMapper", UserMapper.class);
        personMapper.select().forEach(System.out::println);

    }
}
