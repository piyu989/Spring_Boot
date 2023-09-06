package com.api.book.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.api.book.Entities.Book;

@Service
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
	
	public Book getBook(int id) {
		for(int i=0;i<li.size();i++) {
			Book temp=li.remove(i);
			if(temp.getId()==id) {
				return temp;
			}
		}
		return null;
	}
	
}
