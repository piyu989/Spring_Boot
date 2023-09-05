package com.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserEntity {
	@Id
	public int Id;
	public String name;
	public int age;
	public String state;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", age=" + age + ", state=" + state + "]";
	}
	public UserEntity(int id, String name, int age, String state) {
		super();
		Id = id;
		this.name = name;
		this.age = age;
		this.state = state;
	}
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
