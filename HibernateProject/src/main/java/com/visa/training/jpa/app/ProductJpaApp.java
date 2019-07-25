package com.visa.training.jpa.app;

import java.sql.SQLException;
import java.util.List;

import com.visa.training.jpa.dal.JpaProductDAO;
import com.visa.training.jpa.domain.Product;

public class ProductJpaApp {
	
	public static void main(String[] args) throws SQLException {
		JpaProductDAO dao = new JpaProductDAO();
	//	Product test = new Product("hibernate_modified", 1000, 1000);
	//	Product test =new Product();
       // Product saved = dao.save(test);
       // System.out.println(saved);
     //  test.setId(9);
     //   Product p = dao.update(test);
       // dao.remove(9);
        
      //  System.out.println(test);
      List<Product> all=  dao.findByPriceGreaterThan(100);
        all.forEach(System.out::println);
        
		
	}

}
