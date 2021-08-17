package com.proxy.dongtai;

import com.yqx.dongtai.UserService;

/**
 * @author fanzx
 * @create 2021/8/17 11:30
 */
public class PersonServiceImpl implements PersonService {
    @Override
    public void add() {
        System.out.println("addPerson");
    }

    @Override
    public void update() {
        System.out.println("updatePerson");
    }

    @Override
    public void deleted() {
        System.out.println("deletedPerson");
    }

    @Override
    public void select() {
        System.out.println("queryPerson");
    }
}
