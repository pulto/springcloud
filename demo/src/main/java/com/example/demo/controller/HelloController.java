package com.example.demo.controller;

import com.example.demo.beans.BlogProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    BlogProperties blogProperties;
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
    @GetMapping("/test")
    public  String test() throws Exception {
        throw new Exception("发⽣错误");
    }
}
