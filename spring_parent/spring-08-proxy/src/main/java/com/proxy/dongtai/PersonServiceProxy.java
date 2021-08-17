package com.proxy.dongtai;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author fanzx
 * @create 2021/8/17 11:31
 */
@Data
@AllArgsConstructor
public class PersonServiceProxy implements PersonService{

    private PersonServiceImpl personService;

    @Override
    public void add() {
        this.log("add");
        personService.add();
    }

    @Override
    public void update() {
        this.log("update");
        personService.update();
    }

    @Override
    public void deleted() {
        this.log("deleted");
        personService.deleted();
    }

    @Override
    public void select() {
        this.log("select");
        personService.select();
    }

    /**
     * 代理 增强方法
     */
    public void log(String msg){
        System.out.println("[DEBUG]" + msg);
    }

}
