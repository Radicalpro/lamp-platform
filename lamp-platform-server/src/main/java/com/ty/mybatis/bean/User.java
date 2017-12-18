package com.ty.mybatis.bean;

import lombok.Data;

/**
 * @author ty
 */
@Data
public class User {
    private Integer id;

    private String username;

    private String password;

    private Integer roleId;
}