package com.example.springbootdemo.controller;


import com.example.springbootdemo.domain.User;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("Hello")
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping("test")
    @ResponseBody
    User test() {
        return userService.getAllUser();
    }
}
