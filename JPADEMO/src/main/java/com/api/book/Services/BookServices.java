package com.api.book.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
		try {
			book=li.stream().filter(e->e.getId()==id).findFirst().get();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return book;
	}
	
	public Book addBook(Book b) {
		li.add(b);
		return b;
	}
	
	public void delBook(int id) {
		li=li.stream().filter(e->e.getId()!=id).collect(Collectors.toList());
	}
	
	public void updateBook(Book b,int id) {
//		for(int i=0;i<li.size();i++) {
//			Book temp=li.get(i);
//			if(temp.getId()==id) {
//				temp.setAuthorName(b.getAuthorName());
//				temp.setName(b.getName());
//			}
//		}
		li=li.stream().map(bb->{
			if(bb.getId()==id) {
				bb.setName(b.getName());
				bb.setAuthorName(b.getAuthorName());
			}
			return b;
		}).collect(Collectors.toList());
	}
	
}
