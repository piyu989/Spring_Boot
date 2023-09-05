package com.jpa.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.entities.user;
@Repository
public interface UserRepository extends JpaRepository<user,Integer> {
    
}