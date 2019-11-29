package com.spring_boot_demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("view-index")
    public String viewIndex() {
        return "index";
    }
}
