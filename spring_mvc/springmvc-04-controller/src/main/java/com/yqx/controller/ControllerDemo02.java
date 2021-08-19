package com.yqx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author fanzx
 * @create 2021/8/19 10:59
 * 实现了Controller的类 就代表这是一个控制器
 */
@Controller
public class ControllerDemo02 {

    @RequestMapping("test2")
    public String test1(Model model){
        model.addAttribute("msg","我也不知道2");
        return "test";
    }

}
