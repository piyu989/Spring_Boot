package com.api.book.Entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Book {	
	@Id
	@Column(name ="Book_id")
	private int id;
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private Author authorName;
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
	public Author getAuthorName() {
		return authorName;
	}
	public void setAuthorName(Author authorName) {
		this.authorName = authorName;
	}
	public Book(int id, String name, Author authorName) {
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
