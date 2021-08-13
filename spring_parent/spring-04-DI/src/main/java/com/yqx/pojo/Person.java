package com.yqx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author fanzx
 * @create 2021/8/13 10:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {

    private String name;
    private Integer age;

}
