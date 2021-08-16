package com.yqx.dongtai;

/**
 * @author fanzx
 * @create 2021/8/16 15:58
 */
public class UserTest {

    public static void main(String[] args) {

        // 动态代理
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy(userService);
        userServiceProxy.add();
        userServiceProxy.update();
        userServiceProxy.query();
        userServiceProxy.deleted();

    }

}
