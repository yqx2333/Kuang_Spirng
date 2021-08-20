package com.yqx.controller;

import com.yqx.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fanzx
 * @create 2021/8/20 11:07
 */
@Controller
@RequestMapping("/books")
public class BooksController {

    @Autowired
    private BooksService booksService;

    /**
     * 查询所有Book
     * @param model
     * @return
     */
    @RequestMapping("/allBook")
    public String list(Model model){
        model.addAttribute("list",booksService.selectAll());
        return "allBook";
    }

}
