package com.trans.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author fanzx
 * @create 2021/8/17 16:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private Integer id;
    private String name;
    private String pwd;

}
