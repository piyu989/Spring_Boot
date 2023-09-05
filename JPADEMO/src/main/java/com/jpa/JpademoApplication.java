package com.jpa;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.dao.UserRepo;
import com.jpa.entity.UserEntity;

@SpringBootApplication
public class JpademoApplication {

	public static void main(String[] args) {
//		ApplicationContext co=SpringApplication.run(JpademoApplication.class, args);
//		UserRepo repo=co.getBean(UserRepo.class);
//		
//		User u=new User();
//		u.setId(67);
//		u.setName("Piyush");
//		User us=repo.save(u);
//		System.out.println(us);
		
		ApplicationContext context=SpringApplication.run(JpademoApplication.class, args);
		
		UserRepo repo=context.getBean(UserRepo.class);
		
		//entering multiple user
		
//		UserEntity u=new UserEntity();
//		u.setId(1);
//		u.setName("Piyush");
//		u.setState("Delhi");
//		u.setAge(19);
//		
//		UserEntity uu=new UserEntity();
//		uu.setId(10);
//		uu.setName("Piyush Thakur");
//		uu.setState("Bharat");
//		uu.setAge(19);
//		
//		List<UserEntity>li=List.of(u,uu);
//		repo.saveAll(li);
		
		//updating existing user
//		Optional<UserEntity>op=repo.findById(10);
//		UserEntity u=op.get();
//		u.setName("udit");
//		repo.save(u);
		
		//getting element from db
//		Iterable<UserEntity>it=repo.findAll();
//		Iterator<UserEntity>itr=it.iterator();
//		
//		itr.forEachRemaining(u->{System.out.println(u);});
		
//		while(itr.hasNext()) {
//			UserEntity u=itr.next();
//			System.out.println(u);
//		}
		UserEntity a=new UserEntity();
		a.setAge(12);
		a.setId(122);
		a.setName("bhuvam");
		a.setState("mumbai");
		repo.save(a);
		//deleting the user or entity from db
		
//		repo.delete(a);
//		List<UserEntity> u=repo.findByName("bhuvam");
//		u.forEach(e->{System.out.println(e);});
		
//		List<UserEntity> u=repo.getUserByNameAndAge("bhuvam", 12);
//		u.forEach(e->{System.out.println(e);});
		
		List<UserEntity> u=repo.getUser();
		u.forEach(e->{System.out.println(e);});
		
		
		
	}

}
