package com.demo.recruit_back.controller;

import com.demo.recruit_back.entity.User;
import com.demo.recruit_back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {

    @Autowired
    private UserService userService;

    @CrossOrigin("*")
    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

}
