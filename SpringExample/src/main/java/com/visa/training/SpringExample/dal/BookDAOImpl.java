//package com.visa.training.SpringExample.dal;
//
//import java.util.ArrayList;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.transaction.Transactional;
//
//import org.springframework.stereotype.Repository;
//
//import com.visa.training.SpringExample.domain.Book;
//
//@Repository// class provides the mechanism for crud operations
//@Transactional
//public class BookDAOImpl implements BookDAO{
//	
//	@PersistenceContext
//	EntityManager em;
//	
//	@Override
//	public Book save(Book b) {
//    em.persist(b);
//     return b;
//	}
//
//	@Override
//	public Book update(Book b) {
//		
//em.merge(b)	;
//return null;
//	}
//
//	@Override
//	public void remove(int id) {
//em.remove(em.find(Book.class, id));		
//	}
//
//	@Override
//	public Book findById(int id) {
//Book b = em.find(Book.class, id)	;
//return b;
//	}
//
//	@Override
//	public List<Book> findAll() {
//List<Book> b=new ArrayList<Book>();
//javax.persistence.Query q= em.createQuery("select b from book as b");
//b = q.getResultList();
//return b;
//	}
//
//}
