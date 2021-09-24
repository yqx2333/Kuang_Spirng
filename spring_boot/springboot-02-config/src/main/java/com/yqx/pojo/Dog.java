package com.yqx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author fanzx
 * @create 2021/8/24 17:40
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Dog {

    private String name;
    private Integer age;

}
