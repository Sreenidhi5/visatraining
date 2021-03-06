package com.visa.training.jpa.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.visa.training.jpa.dal.JpaUtil;
import com.visa.training.jpa.domain.Account;
import com.visa.training.jpa.domain.CurrentAccount;
import com.visa.training.jpa.domain.SavingsAccount;

public class InheritanceTest {
	public static void main(String[] args) {
		EntityManager em= JpaUtil.getEmf().createEntityManager();
		EntityTransaction ts= em.getTransaction();
		ts.begin();
		
		SavingsAccount sa= new SavingsAccount();
        CurrentAccount ca = new CurrentAccount(100000, 10000);
        
        em.persist(sa);
        em.persist(ca);
        
        ts.commit();
        Account unknown = em.find(Account.class, sa.getId());
        System.out.println("This account is of type"+unknown.getClass().getName());
        em.close();
        System.exit(0);

    }

	}

