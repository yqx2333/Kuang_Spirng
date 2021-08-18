package com.yqx.controller;

import com.yqx.user.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author fanzx
 * @create 2021/8/18 18:04
 */
public class UserController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","这是UserController中展示的内容");
        modelAndView.addObject("user",new User(1,"张三","2333"));
        modelAndView.setViewName("text");
        return modelAndView;
    }
}
