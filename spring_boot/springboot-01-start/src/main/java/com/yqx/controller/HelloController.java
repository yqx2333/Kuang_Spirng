package com.yqx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanzx
 * @create 2021/8/24 10:39
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello Spring Boot";
    }

}
