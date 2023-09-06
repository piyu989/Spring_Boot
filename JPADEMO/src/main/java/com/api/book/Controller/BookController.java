package com.api.book.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.Entities.Book;
import com.api.book.Services.BookServices;

@RestController
public class BookController {

	@Autowired
	private BookServices bookServices; 
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		return this.bookServices.getAllBook();
	}
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id) {
		return bookServices.getBookById(id);
	}
}
