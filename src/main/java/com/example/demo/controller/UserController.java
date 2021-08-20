package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class UserController {
    @Autowired
    public IUserService userService;

    @RequestMapping("/query")
    @ResponseBody
    public List<User> query(@RequestBody Map<String, Object> param) {
        List<User> userList = userService.query(param);
        return userList;
    }

}
