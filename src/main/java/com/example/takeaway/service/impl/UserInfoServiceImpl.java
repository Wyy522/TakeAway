package com.example.takeaway.service.impl;

import com.example.takeaway.dao.UserInfo;
import com.example.takeaway.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl {
    @Autowired
    UserMapper userMapper;

    public UserInfo getUserById(Integer id){
        return userMapper.getUserById(id);
    }
}
