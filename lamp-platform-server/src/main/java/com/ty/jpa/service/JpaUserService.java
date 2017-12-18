package com.ty.jpa.service;

import com.ty.jpa.bean.JpaUser;
import com.ty.jpa.repository.JpaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author tianyi
 */
@Service
public class JpaUserService {

    @Autowired
    private JpaUserRepository jpaUserRepository;

    @Transactional(rollbackFor = Exception.class)
    public JpaUser findOne(int id) {
        return jpaUserRepository.findOne(id);
    }
}
