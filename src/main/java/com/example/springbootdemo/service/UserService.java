package com.example.springbootdemo.service;

import com.example.springbootdemo.domain.User;
import com.example.springbootdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;


    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
