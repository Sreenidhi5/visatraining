package com.visa.training.jdbc;

import java.sql.SQLException;
import java.util.List;

public class ProductUtil extends ProductDAO {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ProductDAO dao = new  ProductDAO();
//		Product p1= new Product("pojo",100,10);
//		int generatedId= dao.save(p1);
//		System.out.println("created product with id " + generatedId);
//		Product fromDB =dao.findById(generatedId);
//		System.out.println(fromDB);
//		List<Product> list = dao.findAll();
//		list.forEach(System.out::println);
      
	dao.remove(1);
	List<Product> list = dao.findAll();
	list.forEach(System.out::println);
  
	
		
	}

}
