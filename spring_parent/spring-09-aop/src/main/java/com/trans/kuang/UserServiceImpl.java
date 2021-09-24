package com.trans.kuang;

/**
 * @author fanzx
 * @create 2021/8/16 15:55
 */
public class UserServiceImpl implements UserService{
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
