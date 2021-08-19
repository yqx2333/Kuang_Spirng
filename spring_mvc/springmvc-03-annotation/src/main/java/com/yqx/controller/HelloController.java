package com.yqx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fanzx
 * @create 2021/8/19 10:02
 */
@Controller
@RequestMapping("/mvc")
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model){
        // 封装数据,可以在JSP页面中自动取出并渲染;
        model.addAttribute("msg","SSSSpring///MMvvvC");
        // 直接在这里返回 jsp页面的名称即可,Spring会自动帮我们拼接;
        return "hello";
    }
}
