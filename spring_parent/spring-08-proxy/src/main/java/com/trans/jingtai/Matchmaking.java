package com.trans.jingtai;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author fanzx
 * @create 2021/8/16 15:29
 * 婚介所
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Matchmaking implements Marry{

    Parent parent = new Parent();

    @Override
    public void marry() {
        parent.marry();
        this.money();
        this.seeWoman();
    }

    public void seeWoman(){
        System.out.println("婚介所带小明相亲");
    }

    public void money(){
        System.out.println("婚介所让小明掏钱");
    }
}
