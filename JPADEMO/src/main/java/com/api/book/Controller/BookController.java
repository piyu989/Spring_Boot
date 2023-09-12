package com.api.book.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<List<Book>> getBooks() {
		List<Book>li=this.bookServices.getAllBook();
		if(li.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(li));
	}
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBook(@PathVariable("id") int ide) {
		Book b=this.bookServices.getBookById(ide);
		if(b==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(b));
	}
	@PostMapping("/books")
	public ResponseEntity<Book> addBook(@RequestBody Book b) {
		Book bb=null;
		try {
			bb=this.bookServices.addBook(b);
			return ResponseEntity.of(Optional.of(bb));
		}catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	@DeleteMapping("/books/{id}")
	public ResponseEntity<Book> deleteBook(@PathVariable("id")int id) {
		try{
			this.bookServices.delBook(id);
			return ResponseEntity.status(HttpStatus.OK).build();
		}catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	
	@PutMapping("/books/{id}")
	public Book updateBook(@RequestBody Book b,@PathVariable("id")int id) {
		this.bookServices.updateBook(b, id);
		return b;
	}
	
}
