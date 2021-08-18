package com.trans.pojo;

import lombok.Data;

/**
 * @author fanzx
 * @create 2021/8/10 16:25
 */
@Data
public class User {

    private String name;

    /**
     * 有参构造方法创建对象
     * @param name
     */
    public User(String name) {
        this.name = name;
    }

    /**
     * 无参构造方法创建对象
     */
    /*public User() {
        System.out.println("User的无参构造");
    }*/

    public void show(){
        System.out.println("name -----> " + name);
    }

}
