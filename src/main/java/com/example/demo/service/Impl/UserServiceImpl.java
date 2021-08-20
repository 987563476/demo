package com.example.demo.service.Impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    public UserMapper userMapper;

    @Override
    public List<User> query(Map<String, Object> param) {
        return userMapper.select(param);
    }
}
