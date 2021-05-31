package com.kidcools.cn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
public class KidcoolController {
    @RequestMapping("/hello")
    public String hellow(String name){
        return "hello3---"+name;

    }
}
