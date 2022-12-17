package com.springjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "Welcome to Spring JWT";
    }

    @GetMapping("/home")
    public String home() {
        return "Welcome to Spring JWT Home Page";
    }

}
