package com.chen.dao;

import com.chen.pojo.User;

import java.util.List;

public interface UserMapper {
    void userRegister(User user);
    List<User> getAllUser();
}
