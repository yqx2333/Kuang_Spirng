package com.yqx.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author fanzx
 * @create 2021/8/18 16:11
 */
public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // ModelAndView 模型和视图
        ModelAndView modelAndView = new ModelAndView();
        // 封装对象 放在ModelAndView中
        modelAndView.addObject("msg","HelloSpringMVC");
        // 封装要跳转的视图,放在ModelAndView中  也就是/WEB-INF/jsp/hello.jsp
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
