package com.api.book.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public Book getBook(@PathVariable("id") int ide) {
		return bookServices.getBookById(ide);
	}
	@PostMapping("/books")
	public Book addBook(@RequestBody Book b) {
		this.bookServices.addBook(b);
		return b;
	}
	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable("id")int id) {
		this.bookServices.delBook(id);
		System.out.println("done.....");
	}
	
	@PutMapping("/books/{id}")
	public Book updateBook(@RequestBody Book b,@PathVariable("id")int id) {
		this.bookServices.updateBook(b, id);
		return b;
	}
	
}
