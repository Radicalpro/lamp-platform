package com.ty.jpa.controller;

import com.ty.jpa.bean.JpaUser;
import com.ty.jpa.service.JpaUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ty
 * @date 2017/12/18
 */
@RestController
@RequestMapping("jpa/user")
@Slf4j
public class JpaUserController {

    @Autowired
    private JpaUserService jpaUserService;

    /**
     * 根据id查询管理员信息
     *
     * @return User
     */
    @RequestMapping("/selectByPrimaryKey")
    public JpaUser selectByPrimaryKey() {
        return jpaUserService.findOne(1);
    }
}
