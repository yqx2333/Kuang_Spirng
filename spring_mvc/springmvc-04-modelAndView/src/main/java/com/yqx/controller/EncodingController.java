package com.yqx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author fanzx
 * @create 2021/8/19 15:27
 */
@Controller
public class EncodingController {

    @PostMapping("/encoding")
    public String encoding(String name, Model model){
        model.addAttribute("msg",name);
        return "test";
    }

}
