package com.yqx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author fanzx
 * @create 2021/8/19 16:21
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

    public String name;
    public Integer age;
    public String sex;

}
