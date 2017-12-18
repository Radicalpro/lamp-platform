package com.ty.demo.controller;

import com.ty.demo.bean.User;
import com.ty.demo.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ty
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/selectByPrimaryKey")
    public User selectByPrimaryKey() {
///        User user = new User();
//        user.setId(2);
//        user.setUsername("ty");
//        user.setPassword("123456");
//        user.setRoleId(0);
//        return user;
        log.info("日志打印");
        return userMapper.selectByPrimaryKey(1);
    }
}
