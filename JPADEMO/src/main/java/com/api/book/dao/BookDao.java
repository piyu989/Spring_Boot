package com.api.book.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.book.Entities.Book;

public interface BookDao extends CrudRepository<Book, Integer> {
	public Book findBookById(int id);
}
