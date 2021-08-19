package com.yqx.controller;

import com.sun.org.glassfish.gmbal.ParameterNames;
import com.yqx.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author fanzx
 * @create 2021/8/19 15:09
 */
@Controller
public class UserController {

    @GetMapping("/user")
    public String test(String name, Model model){
        // 接收前端参数
        System.out.println("接收到前端参数为:" + name);
        // 将返回的结果传递给前端
        model.addAttribute("msg",name);
        return "test";
    }

    @GetMapping("/user2")
    public String test2(@RequestParam("username") String name, Model model){
        // 接收前端参数
        System.out.println("接收到前端参数为:" + name);
        // 将返回的结果传递给前端
        model.addAttribute("msg",name);
        return "test";
    }

    /**
     * 如果前端传入的是一个对象?
     * 接收前端用户传递的参数,判断参数的名字; 假设参数直接在方法上,就可以直接使用;
     * 假设传递的是一个对象,那么就会匹配对象中的字段名;如果字段一致则ok,否则不能匹配;
     * @return
     */
    @GetMapping("/user3")
    public String test3(User user,Model model){
        model.addAttribute("msg",user);
        return "test";
    }

}
