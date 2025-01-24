package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/session-login-scope")
public class SessionScopeLoginController {

    @Autowired
    HttpSession session;

    @RequestMapping("")
    public String index() {
        return "session-scope-login-form";
    }

    @RequestMapping("/input-acount")
    public String inputAcount(String mailaddress, String pass) {
        String keyMailaddress = "test@example.com";
        String keyPass = "123";

        if (keyMailaddress.equals(mailaddress) && keyPass.equals(pass)) {
            session.setAttribute("Mailaddress", mailaddress);
            session.setAttribute("Pass", pass);
            return "result-session-login-hello-scope";
        } else {
            return "session-scope-login-form";
        }
    }

    @RequestMapping("/login-page")
    public String tologinpage() {
        return "result-session-login-scope";
    }
}
