package com.ty.demo.controller;

import com.ty.demo.bean.User;
import com.ty.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ty
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/selectByPrimaryKey")
    public User selectByPrimaryKey() {
        return userMapper.selectByPrimaryKey(1);
    }
}
