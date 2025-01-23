package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/request-scope1")
public class RequestSumScopeController {
@RequestMapping("")
public String index(){
    return"request-sum-scope-form";
}

@RequestMapping("input-sum")
public String result(String num1,String num2,String operation,Model model){
    int a=Integer.valueOf(num1);
    int b=Integer.valueOf(num2);
    int showresult=0;
    String message="";

    if(operation.equals("add")){
        showresult=a+b;
    }else if(operation.equals("sub")){
        showresult=a-b;
    }else if(operation.equals("multi")){
        showresult=a*b;
    }else if(operation.equals("div")){
        if(b!=0){showresult=a/b;}
    }else{message="0で割ることはできません";
    System.out.println(message);}
    
    if(message.isEmpty()){
        model.addAttribute("result", showresult);
    }else{model.addAttribute("result",message);}

    return "result-request-sum-scope";
    
}
}
