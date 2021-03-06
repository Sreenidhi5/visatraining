package com.visa.training.SpringExample.domain;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Chapter {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	int chid;
	int ino;
	String chname;
	int numofpages;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
	@JoinColumn(name="book_id")
	Book book;
	
	
	@JsonIgnore
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	public String getChname() {
		return chname;
	}
	public void setChname(String chname) {
		this.chname = chname;
	}
	public int getNumofpages() {
		return numofpages;
	}
	public void setNumofpages(int numofpages) {
		this.numofpages = numofpages;
	}
	public Chapter(int ino, String chname, int numofpages) {
		super();
		this.ino = ino;
		this.chname = chname;
		this.numofpages = numofpages;
	}
	@Override
	public String toString() {
		return "Chapter [chid=" + chid + ", ino=" + ino + ", chname=" + chname + ", numofpages=" + numofpages
				 + "]";
	}
	public int getIno() {
		return ino;
	}
	public void setIno(int ino) {
		this.ino = ino;
	}
	public Chapter() {
		super();
	}
	
	
	
	
}
