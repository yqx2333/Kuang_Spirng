package com.trans.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

/**
 * @author fanzx
 * @create 2021/8/13 11:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class People {

    @Autowired
    @Nullable
    @Qualifier(value = "cat1")
    private Cat cat;
    @Nullable
    @Autowired
    @Qualifier(value = "dog1")
    private Dog dog;
    private String name;

}
