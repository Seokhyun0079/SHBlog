package com.my.blog.freeboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreeboardController {
    public FreeboardController() {
        System.out.println("생성?");
    }

    @RequestMapping("/freeboard/main.do")
    public String dispactchFreeboard(){
        return "/WEB-INF/views/freeboard/main.jsp";
    }
}
