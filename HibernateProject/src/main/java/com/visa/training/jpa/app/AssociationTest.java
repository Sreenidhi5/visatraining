package com.visa.training.jpa.app;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.visa.training.jpa.dal.JpaUtil;
import com.visa.training.jpa.domain.Account;
import com.visa.training.jpa.domain.Address;
import com.visa.training.jpa.domain.CurrentAccount;
import com.visa.training.jpa.domain.Customer;
import com.visa.training.jpa.domain.SavingsAccount;

public class AssociationTest {
	
	public static void main(String[] args) {
		
		//createAccountAddCustomerSeparately();
	//	readAlongWithCustomer();
	//	createAccountAndCustomerTogether();
		testLazy();
		testManyToMany();
		
		System.exit(0);
		
	}


	private static void testManyToMany() {
		// TODO Auto-generated method stub
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		EntityTransaction ts= em.getTransaction();
		ts.begin();
		 Customer c = new Customer("ffn", "mmn", "lln", (java.sql.Date) new Date(System.currentTimeMillis()));
	        Address a = new Address("sl1", "sl2", "blr", "ka", "56", "in");
	        
	        c.getAddresses().add(a);
	        
	        em.persist(c);
	        ts.commit();
		
		em.close();
		
		
	}


	private static void testLazy() {
		// TODO Auto-generated method stub
		
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		EntityTransaction ts= em.getTransaction();
		ts.begin();
		Customer c1= em.find(Customer.class, 12);
		
		em.close();
		Account a1 = c1.getAccounts().get(0);
		System.out.println(a1.getBalance());
		
		//em.close();
		
	}


	private static void readAlongWithCustomer() {
		// TODO Auto-generated method stub
		
		EntityManager em= JpaUtil.getEmf().createEntityManager();
		EntityTransaction ts= em.getTransaction();
		ts.begin();
		
		SavingsAccount sa= em.find(SavingsAccount.class, 12);
		System.out.println(sa.getCustomer().getFirstname());
		
		
		
		  ts.commit();
	        
	        em.close();
	        System.exit(0);
		
	}


	private static void createAccountAddCustomerSeparately() {
		// TODO Auto-generated method stub
		
		EntityManager em= JpaUtil.getEmf().createEntityManager();
		EntityTransaction ts= em.getTransaction();
		ts.begin();
		
	Customer c = new Customer("fn","mn","ln",(java.sql.Date) new Date(System.currentTimeMillis()));
	
	SavingsAccount sa= new SavingsAccount(1234);
	
	
	
	
	sa.setCustomer(c);
	
	em.persist(c);
	em.persist(sa);
	
	
        
        ts.commit();
        
        em.close();
        System.exit(0);

		
	}
	
	private static void createAccountAndCustomerTogether() {
		// TODO Auto-generated method stub
		
		EntityManager em= JpaUtil.getEmf().createEntityManager();
		EntityTransaction ts= em.getTransaction();
		ts.begin();
		
	Customer c = new Customer("fn","mn","ln",(java.sql.Date) new Date(System.currentTimeMillis()));
	
	SavingsAccount sa= new SavingsAccount(1234);	
	sa.setCustomer(c);
	
	//em.persist(c);
	em.persist(sa);       
        ts.commit();
        em.close();
        System.exit(0);

		
	}
}
