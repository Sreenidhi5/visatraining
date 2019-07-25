package com.visa.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.visa.training.ui.ProductConsoleUI;

public class ProductApp {
	
	public static void main(String[] args) {
		//ProductConsoleUI p= new ProductConsoleUI();
		Class[] configs= {ProductAppConfiguration.class,PersistenceJPAConfiguration.class};
		ApplicationContext springContext= new AnnotationConfigApplicationContext(configs);
		
		ProductConsoleUI ui = springContext.getBean(ProductConsoleUI.class);
		ui.createProductWithUI();
		
		
		
	}

}
