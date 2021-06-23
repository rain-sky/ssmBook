package com.chen.service;

import com.chen.dao.UserMapper;
import com.chen.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {
    @Autowired
    private UserMapper userMapper;
    public void userRegister(User user){
        userMapper.userRegister(user);
    }

    public List<User> getAllUser(){
        return userMapper.getAllUser();
    }
}
