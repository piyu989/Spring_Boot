package com.sec.Models;


public class User {
	public String name;
	public String usename;
	String password;
	@Override
	public String toString() {
		return "User [name=" + name + ", usename=" + usename + ", password=" + password + "]";
	}
	public User(String name, String usename, String password) {
		super();
		this.name = name;
		this.usename = usename;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsename() {
		return usename;
	}
	public void setUsename(String usename) {
		this.usename = usename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
