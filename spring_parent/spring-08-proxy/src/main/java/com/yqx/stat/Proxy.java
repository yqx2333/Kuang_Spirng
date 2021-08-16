package com.yqx.stat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author fanzx
 * @create 2021/8/16 14:54
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Proxy implements Rent{

    // 代理人 要把房东代理了
    private Host host;

    @Override
    public void rent() {
        System.out.println("代理人帮房东租房子");
    }

    public void seeHouse() {
        System.out.println("代理人带你去看房子");
    }
}


