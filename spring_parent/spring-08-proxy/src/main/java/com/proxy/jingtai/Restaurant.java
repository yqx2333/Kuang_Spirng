package com.proxy.jingtai;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author fanzx
 * @create 2021/8/17 11:25
 */
@Data
@AllArgsConstructor
public class Restaurant implements Eat{

    Hungry hungry = new Hungry();

    @Override
    public void eat() {
        this.main();
        this.hungry.eat();
    }

    public void main(){
        System.out.println("餐馆给你做饭");
    }

}
