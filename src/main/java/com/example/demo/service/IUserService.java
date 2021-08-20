package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;
import java.util.Map;


public interface IUserService {
    public List<User> query(Map<String,Object> param);
}
