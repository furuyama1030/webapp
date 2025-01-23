package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.form.ReceiveForm;

@Controller
@RequestMapping("/receive")

public class ReceiveController {

    @RequestMapping("")
    public String index() {
        return "info-form";
    }

    @RequestMapping("/receive-info")
    public String receiveInfo(ReceiveForm receiveForm) {

        System.out.println("入力された名前は" + receiveForm.getName() + "です。");
        System.out.println("入力された年齢は" + receiveForm.getAge() + "です。");
        return "finished";

    }
}
