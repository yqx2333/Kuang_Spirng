package com.yqx.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author fanzx
 * @create 2021/8/18 17:52
 */
public class HelloController implements Controller {

    /**
     * 处理结果 视图跳转
     */
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        // 业务逻辑代码
        String result = "HelloSpringMvc";
        // 视图跳转
        modelAndView.addObject("msg",result);
        // 返回jsp页面
        modelAndView.setViewName("hello");
        return modelAndView;
    }

}
