package com.api.book.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Author {
	@Id
	private int id;
	private String name;
	private String lastName;
	@OneToOne(mappedBy = "authorName")
	@JsonBackReference
	private Book book;
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
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
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(int id, String name, String lastName) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", lastName=" + lastName + "]";
	}
	
	
	
}
