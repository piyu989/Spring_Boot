package com.jpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.entity.user;

@Repository
public interface UserRepository extends CrudRepository<user, Integer> {

}
