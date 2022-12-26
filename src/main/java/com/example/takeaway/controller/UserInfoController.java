package com.example.takeaway.controller;

import com.example.takeaway.dao.UserInfo;
import com.example.takeaway.mapper.UserMapper;
import com.example.takeaway.service.impl.UserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserInfoServiceImpl userInfoService;

    @GetMapping("/{id}")
    public UserInfo getUserById(@PathVariable("id") Integer id) {
        return userInfoService.getUserById(id);
    }

}
