package com.trans.jingtai;

/**
 * @author fanzx
 * @create 2021/8/16 15:28
 */
public class Client {

    public static void main(String[] args){

        Parent parent = new Parent();
        Matchmaking matchmaking = new Matchmaking(parent);
        matchmaking.marry();

    }

}
