package com.adt.service.user.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestCtl {

    @RequestMapping("test")
    public String testPage() {
        return "test";
    }
}
