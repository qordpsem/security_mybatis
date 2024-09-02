package com.example.security_mybatis.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
