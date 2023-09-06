package com.api.book.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
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
}
