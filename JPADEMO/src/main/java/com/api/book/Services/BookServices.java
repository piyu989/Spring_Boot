package com.api.book.Services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.api.book.Entities.Book;

@Component
public class BookServices {
	private static List<Book>li=new ArrayList<>();
	
	static {
		li.add(new Book(1,"Mahan Bharat","Rajix Dixit"));
		li.add(new Book(2,"The Ancient Bharat","Piyush"));
		li.add(new Book(3,"The Old Bharat","Piyush Thakur"));
	}
	
	public List<Book> getAllBook(){
		return li;
	}
	
	public Book getBookById(int id) {
		Book book=null;
		book=li.stream().filter(e->e.getId()==id).findFirst().get();
		return book;
	}
	
}
