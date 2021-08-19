package com.yqx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author fanzx
 * @create 2021/8/19 14:18
 */
@Controller
public class ModelTest {

    @GetMapping("/m1/t1")
    public String test1(HttpServletRequest request, HttpServletResponse response){
        // Request和Response对象都能够正常使用
        System.out.println(request.getSession().getId());
        return "test";
    }

    @GetMapping("/m1/t2")
    public String test2(Model model){
        model.addAttribute("msg","转发请求到指定页面上");
        // 没有实体解析器的话 需要写全限定类名
        return "forward:/WEB-INF/jsp/test.jsp";
    }

    @GetMapping("/m1/t3")
    public String test3(Model model){
        model.addAttribute("msg","转发请求到指定页面上");
        // 有视图解析器的情况下 想使用重定向 直接加上redirect即可;
        return "redirect:/index.jsp";
    }



    /**
     * 测试通过
     * @param model
     * @return
     */
    @GetMapping("/test")
    public String test(Model model){
        model.addAttribute("msg","我也不知道测试页面");
        return "test";
    }

}
