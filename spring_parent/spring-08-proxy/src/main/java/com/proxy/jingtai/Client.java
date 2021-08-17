package com.proxy.jingtai;

/**
 * @author fanzx
 * @create 2021/8/17 11:28
 */
public class Client {

    public static void main(String[] args){
        Restaurant restaurant = new Restaurant(new Hungry());
        restaurant.eat();
    }

}
