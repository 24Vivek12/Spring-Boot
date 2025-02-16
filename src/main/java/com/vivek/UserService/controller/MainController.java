package com.vivek.UserService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class MainController {


    @GetMapping("data")
    public String getData()
    {
        return "Hello world";
    }
    @GetMapping("hello")
    public String welcome()
    {
        return "Welcome to Spring boot";
    }

}
