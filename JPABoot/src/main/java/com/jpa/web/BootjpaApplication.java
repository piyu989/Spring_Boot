package com.jpa.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.entity.user;
import com.jpa.dao.UserRepository;

@SpringBootApplication
public class BootjpaApplication {

    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(BootjpaApplication.class, args);
        UserRepository userrepo= context.getBean(UserRepository.class);
        user user=new user();
        user.setName("Varun Dhawan");
        user.setCity("Paris");
        user.setStatus("happy");
        user user1= userrepo.save(user);
        System.out.println(user1);
    }

}
