package com.api.book.Entities;

//import jakarta.persistence.Entity;

//@Entity
public class Book {
	private int id;
	private String name;
	private String authorName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Book(int id, String name, String authorName) {
		super();
		this.id = id;
		this.name = name;
		this.authorName = authorName;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", authorName=" + authorName + "]";
	}
	
	
	
}
