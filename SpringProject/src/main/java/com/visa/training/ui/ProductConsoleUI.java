package com.visa.training.ui;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.visa.training.domain.Product;
import com.visa.training.sl.ProductService;
import com.visa.training.sl.ProductServiceImpl;

@Component
public class ProductConsoleUI {
	
	ProductService service;
	
	@Autowired
	public void setService(ProductService service) {
		this.service = service;
	}


	public void createProductWithUI() {
		Scanner kb = new Scanner(System.in);
		System.out.println("entera a name");
		String name= kb.nextLine();
		System.out.println("enter a price");
		float price =Float.parseFloat(kb.nextLine());
		System.out.println("enter quantity");
		int qoh=Integer.parseInt(kb.nextLine());
		
Product p = new Product(name,price,qoh);
try {
    int id = service.addNewProduct(p);
    System.out.println("Created product with id : "+id);
} catch (Exception e) {
    System.out.println("Value too low for creation");
}


}
	}

