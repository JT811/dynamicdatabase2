package com.example.sml.service.Impl;

import com.example.sml.entity.User;
import com.example.sml.mapper.base2.UserMapper;
import com.example.sml.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public int totalCount() {
        return userMapper.totalCount();
    }

    @Override
    public List<User> allUsers() {
        return userMapper.allUsers();
    }
}
