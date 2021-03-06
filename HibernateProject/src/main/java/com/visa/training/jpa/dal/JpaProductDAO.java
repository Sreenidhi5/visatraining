package com.visa.training.jpa.dal;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.visa.training.jpa.domain.Product;


public class JpaProductDAO {
	
	public  Product save(Product p) throws SQLException {
		EntityManagerFactory emf= JpaUtil.getEmf();
		EntityManager em= emf.createEntityManager();
		try {
			EntityTransaction ts=em.getTransaction();
			ts.begin();
			em.persist(p);
			ts.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			em.close();
		}
		
		return p;
		
	}
	public Product findById(int id) {
        EntityManager em = JpaUtil.getEmf().createEntityManager();
        try {
            Product p = em.find(Product.class, id);
            return p;
        } finally {
            em.close();
        }
    }
	
	public Product update(Product p) {
		EntityManagerFactory emf= JpaUtil.getEmf();
		EntityManager em= emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		//Product p = new Product();
		//p= findById(id);
		em.merge(p);
		tx.commit();
		em.close();
		
		return p;
		
	}
	
	public void remove(int id) {
		
		EntityManagerFactory emf= JpaUtil.getEmf();
		EntityManager em= emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Product p = new Product();
p.setId(id);
p = em.find(Product.class, id);
em.remove(p);
		tx.commit();
		em.close();
				
	}
	
	
	public List<Product> findAll(){
		
		EntityManager em= JpaUtil.getEmf().createEntityManager();
		Query q= em.createQuery("select p from product as p");
		List<Product> all = q.getResultList();
		em.close();
		return all;
	}
	
	public List<Product> findByPriceGreaterThan(float price){
		EntityManager em= JpaUtil.getEmf().createEntityManager();
		Query q= em.createQuery("select p from product as p where p.price > ?");
		q.setParameter(1, price);
		List<Product> all = q.getResultList();
		em.close();
		return all;

		
	}

}
