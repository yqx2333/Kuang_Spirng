package com.yqx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author fanzx
 * @create 2021/8/19 11:46
 */
@Controller
public class RestController {

    // RestFul风格
    @RequestMapping(value = "/mapping/{a}/{b}",method = RequestMethod.GET)
    public String requestMapping(@PathVariable String a,@PathVariable String b,Model model){
        String result = a + b;
        model.addAttribute("msg",result);
        return "test";
    }

    @PostMapping("/mapping/{a}/{b}")
    public String postMapping(@PathVariable Integer a,@PathVariable Integer b,Model model){
        Integer result = a + b;
        model.addAttribute("msg",result);
        return "test";
    }
}
