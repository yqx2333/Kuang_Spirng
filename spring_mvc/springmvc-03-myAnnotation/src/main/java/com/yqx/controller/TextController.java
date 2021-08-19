package com.yqx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fanzx
 * @create 2021/8/19 10:22
 */
@Controller
@RequestMapping("/v1")
public class TextController {

    @RequestMapping( "/test" )
    public String text (Model model){
        // 调用业务层,放置参数
        // 放置的参数会自动的在JSP页面中展示出来
        model.addAttribute("msg","我也不知道");
        // 返回的就是视图,也就是对应的jsp页面,Spring会自动帮我们拼接路径
        return "text";
    }

}
