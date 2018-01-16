package com.ty.mybatis.controller;

import com.ty.mybatis.bean.User;
import com.ty.mybatis.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ty
 * @date 2017/12/18
 */
@RestController
@RequestMapping("/mybatis/user")
@Slf4j
public class UserController {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据id查询管理员信息
     *
     * @return User
     */
    @RequestMapping(value = "/selectByPrimaryKey/{userId}", method = RequestMethod.GET)
    public User selectByPrimaryKey(@PathVariable int userId) {
        log.info("日志打印");
///        Integer.parseInt("a");
        return userMapper.selectByPrimaryKey(userId);
    }
}
