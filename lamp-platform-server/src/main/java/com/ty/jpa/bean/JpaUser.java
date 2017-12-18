package com.ty.jpa.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * @author ty
 */
@Data
@Entity
@Table(name = "lamp_user")
public class JpaUser {

    /**
     * id指定主键
     */
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "role_id")
    private Integer roleId;
}