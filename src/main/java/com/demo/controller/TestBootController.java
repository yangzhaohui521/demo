package com.demo.controller;

import com.demo.entity.User;
import com.demo.service.UserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class TestBootController {

    @Resource
    private UserService userService;

    @RequestMapping("/getUserById")
    @ResponseBody
    public User toIndex(String userId){
        User user = this.userService.getUserById(Integer.valueOf(userId));
        return user;
    }


}