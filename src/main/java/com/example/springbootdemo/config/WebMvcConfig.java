package com.example.springbootdemo.config;

import com.example.springbootdemo.intercepter.Intercepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {


    @Autowired
    private Intercepter intercepter;

    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(intercepter).addPathPatterns("/**");
    }
}
