package com.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.entity.UserEntity;

public interface UserRepo extends CrudRepository<UserEntity, Integer> {
//	public List<UserEntity> findByName(String name);

	public List<UserEntity> findByName(String name);
	
	@Query("select u FROM UserEntity u WHERE u.name =:n and u.age =:a")
	public List<UserEntity> getUserByNameAndAge(@Param("n") String name,@Param("a") int Age);
	
	@Query(value="select * from user_entity", nativeQuery=true)
	public List<UserEntity> getUser();

}
