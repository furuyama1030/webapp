package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Hello")
public class HelloController {

    @RequestMapping("/index")
    public String index() {
        return "redirect:/hello/index2";
    }

    @RequestMapping("/index2")
    public String index2(){
        return "hello-world";
    }
}
