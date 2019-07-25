package com.visa.training.sl;

import java.util.List;

import com.visa.training.domain.Product;

public interface ProductService {
	
public int addNewProduct(Product p);
public List<Product> findAll();
public Product findById(int id);
public void deleteProduct(int id);
	
}
