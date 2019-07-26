package com.visa.training.SpringExample.service;

import java.util.List;

import com.visa.training.SpringExample.domain.Book;


public interface BookService {
	public int addNewBook(Book p);
	public Book findById(int id);
	public List<Book> findAll();
	public void deleteBook(int id);
	public void update(Book p);
	
	

}
