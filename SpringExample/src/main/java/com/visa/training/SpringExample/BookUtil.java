//package com.visa.training.SpringExample;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.visa.training.SpringExample.dal.BookDAOImpl;
//import com.visa.training.SpringExample.domain.Book;
//import com.visa.training.SpringExample.domain.Chapter;
//
//@Component
//public class BookUtil {
//	@Autowired
//
//	BookDAOImpl impl;
//	
//	public void createBook()
//	{
//Book b = new Book("book1","author1","catego1",2000);
//Chapter c = new Chapter(3,"ch1",199);
//List<Chapter> ch =b.getChapters();
//ch.add(c);
//
//impl.save(b);
//System.out.println(b);
//	}
//	
//	
//
//}
