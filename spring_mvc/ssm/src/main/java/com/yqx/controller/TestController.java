package com.yqx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fanzx
 * @create 2021/8/20 14:07
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String testView(Model model){
        model.addAttribute("msg","我也不知道");
        return "hello";
    }

}
