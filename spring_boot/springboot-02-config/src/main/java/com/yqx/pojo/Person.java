package com.yqx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author fanzx
 * @create 2021/8/24 17:48
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Person {

    private String name;
    private Integer age;
    private Boolean happy;
    private Date birth;
}
