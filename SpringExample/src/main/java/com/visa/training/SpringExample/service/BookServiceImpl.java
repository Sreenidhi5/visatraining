package com.visa.training.SpringExample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.visa.training.SpringExample.dal.BookRepository;
import com.visa.training.SpringExample.domain.Book;


@Service
public class BookServiceImpl implements BookService {

	BookRepository dao;
	
    @Autowired
	public void setDao(BookRepository dao) {
		this.dao = dao;
	}

	@Override
	public int addNewBook(Book p) {
		int id = 0;
        if(p.getYear()>1980) {
            Book created = dao.save(p);
            id = created.getId();
        }else {
            throw new IllegalArgumentException("year should be greater than 1980");
        }
        return id;
	}

	@Override
	public Book findById(int id) {
		Book b = findById(id);
		return b;
	}

	@Override
	public List<Book> findAll() {
     return dao.findAll();	

	}

	@Override
	public void deleteBook(int id) {
		
dao.deleteById(id);		
	}

	@Override
	public void update(Book p) {
dao.save(p);

	}

	

}
