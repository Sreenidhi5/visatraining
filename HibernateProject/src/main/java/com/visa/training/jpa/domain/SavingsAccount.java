package com.visa.training.jpa.domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;

@Entity
//@Inheritance(strategy=)
@DiscriminatorValue("SA")

public class SavingsAccount extends Account{
	
	public SavingsAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

    public SavingsAccount(float balance) {
        super(balance);
        // TODO Auto-generated constructor stub
    }
    
	

}