package com.visa.training.SpringExample.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Book {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	int bookid;
	String bookname;
	String author;
	String category;
	int year;

	@OneToMany(mappedBy="book",cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
List<Chapter> chapters= new ArrayList<>();


	public List<Chapter> getChapters() {
	return chapters;
}

public void setChapters(List<Chapter> chapters) {
	this.chapters = chapters;
}

	public Book() {
		super();
	}

	public Book(String bookname, String author, String category, int year) {
		super();
		this.bookname = bookname;
		this.author = author;
		this.category = category;
		this.year = year;
	}

	public int getId() {
		return bookid;
	}

	public void setId(int id) {
		this.bookid = id;
	}

	public String getBookName() {
		return bookname;
	}

	public void setBookName(String name) {
		this.bookname = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book [id=" + bookid + ", bookname=" + bookname + ", author=" + author + ", category=" + category + ", year=" + year
				+ "]";
	}
	
	
	
	
	

}
