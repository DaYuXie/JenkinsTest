package com.example.jenkinstest01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class login {

    @RequestMapping("/")
    public String login(){
        return "login";
    }

    @RequestMapping("/test")
    public String test(){
       int a = 200/0;
        System.out.println(a);
        return "ok?";
    }
}
