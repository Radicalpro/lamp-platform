package com.ty.jpa.repository;

import com.ty.jpa.bean.JpaUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author tianyi
 */
@Repository
public interface JpaUserRepository extends CrudRepository<JpaUser, Integer> {
}
