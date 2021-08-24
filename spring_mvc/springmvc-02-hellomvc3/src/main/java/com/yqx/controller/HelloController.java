package com.yqx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fanzx
 * @create 2021/8/23 14:21
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String test(Model model){
        model.addAttribute("msg","我也不知道");
        return "hello";
    }
}
