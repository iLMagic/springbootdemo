package com.example.springbootdemo.service;

import com.example.springbootdemo.domain.User;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
//    @Autowired
//    private UserMapper userMapper;


    public User getAllUser() {
        User user = new User();
        user.setName("hedahai");
        user.setPwd("123");
//        List<User> list = new List<User>();

        return user;
//        return userMapper.getAllUser();
    }
}
