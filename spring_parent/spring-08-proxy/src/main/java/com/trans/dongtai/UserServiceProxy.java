package com.trans.dongtai;

import lombok.AllArgsConstructor;

/**
 * @author fanzx
 * @create 2021/8/16 15:56
 *
 * 代理对象 在不改变原有代码的基础上,对原来的逻辑进行一定的日志输出
 *
 */
@AllArgsConstructor
public class UserServiceProxy implements UserService{

    private UserServiceImpl userService;

    /**
     * 放入UserService set注入
     * @param userService
     */
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    @Override
    public void deleted() {
        log("deleted");
        userService.deleted();
    }

    public void log(String msg){
        System.out.println("[Debug]执行了"+msg+"方法");
    }

}
