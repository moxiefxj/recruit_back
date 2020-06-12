package com.demo.recruit_back.service.impl;

import com.demo.recruit_back.entity.User;
import com.demo.recruit_back.mapper.UserMapper;
import com.demo.recruit_back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UerServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
