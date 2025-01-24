package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/session-scope")
public class SessionScopeController {

    @Autowired
    HttpSession session;

    @RequestMapping("")
    public String index(){
        return "session-scope-form";
    }

    @RequestMapping("/input-name")
    public String inputName(String name){
        session.setAttribute("name",name);
        return "result-session-scope1";
    }

    @RequestMapping("/to-page1")
    public String toPage1(){
        return "result-session-scope1";
    }

    @RequestMapping("/to-page2")
    public String toPage2(){
        return "result-session-scope2";
    }
    @RequestMapping("/to-page3")
    public String toPage3(){
        return "result-session-scope3";
    }



}
