package com.test.method1.service;

/**
 * @author fanzx
 * @create 2021/8/17 15:19
 */
public class PersonServiceImpl implements PersonService{

    @Override
    public void add() {
        System.out.println("addUser");
    }

    @Override
    public void update() {
        System.out.println("updateUser");
    }

    @Override
    public void query() {
        System.out.println("queryUser");
    }

    @Override
    public void deleted() {
        System.out.println("deletedUser");
    }

}
