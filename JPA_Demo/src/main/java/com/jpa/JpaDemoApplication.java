package com.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.dao.UserRepository;
import com.jpa.entities.user;

//@SpringBootApplication
@SpringBootApplication(scanBasePackages = "com.jpa")
public class JpaDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(JpaDemoApplication.class, args);
        UserRepository userrepo= context.getBean(UserRepository.class);
//        user user=new user();
//        user.setName("Varun");
//        user.setCity("Paris");
//        user.setStatus("happy");
//        //here we are saving only one entity
////        user user1= userrepo.save(user);
////        System.out.println(user1);
//        	
//        user user1=new user();
//        user1.setName("Piyush");
//        user1.setCity("bharat");
//        user1.setStatus("enjoyable");
//        
//        //save multiple entity
//        List<user> li=List.of(user,user1);
//        Iterable<user>result=userrepo.saveAll(li);
//        result.forEach(i->{
//        	System.out.println(i);
//        });
//        
//        System.out.println("done");
        
        //updation in db
        Optional<user>optional=userrepo.findById(102);
        user u=optional.get();
        u.setName("udit");
        userrepo.save(u);
	}

}
