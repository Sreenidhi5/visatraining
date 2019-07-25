package com.visa.training.jdbc;
//dao  class has CRUD and Query methods

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
	public  int save(Product toBesaved) throws SQLException {
		// change type to int to generate id
		//insert
		int generatedId=0;
		try {
			Connection c=  JdbcUtil.getConnection();

			//Statement smt = c.createStatement();
			//String query = "insert into product(product_id,product_name,product_price,product_qoh)"+"values"+"("+toBesaved.getId()+", '"+toBesaved.getName()+"' ,"+toBesaved.getPrice()+","+toBesaved.getQoh()+")";;
			String query1 = "insert into product (product_name,product_price,product_qoh) values(?,?,?)";
			PreparedStatement ps= c.prepareStatement(query1,Statement.RETURN_GENERATED_KEYS); // asking to return the generated keyssssssss
		//	ps.setInt(1,toBesaved.getId());
			ps.setString(1,toBesaved.getName());
			ps.setFloat(2, toBesaved.getPrice());
			ps.setInt(3, toBesaved.getQoh());
			ps.executeUpdate();

			ResultSet keys =ps.getGeneratedKeys(); // returns the n coloumns if there are n auto increment parameters
			keys.next();
			generatedId= keys.getInt(1);
			
			//smt.executeUpdate(query1);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return generatedId;
		
	}
	public static Product findById(int id) throws SQLException {
		Product p= null;
		
		try {
			Connection c = JdbcUtil.getConnection();
			String query = "select * from product where product_id =?";

			PreparedStatement smt =c.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
			
			smt.setInt(1,id);
		
			ResultSet res=smt.executeQuery();
			if(res.next()) {
				p = mapRow(res);

			}
		}catch(Exception e) {
			e.printStackTrace();
		} 
		return p;

	
	}
	public List<Product> findAll(){
		List<Product> all = new ArrayList();
		Product p =null;
		try {
			
			Connection c = JdbcUtil.getConnection();
			String query = "select * from product";

			PreparedStatement smt =c.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
			
		
			ResultSet res=smt.executeQuery();
			while(res.next()) {
				p = mapRow(res);
all.add(p);
			}
		}catch(Exception e) {
			e.printStackTrace();
		} 
		return all;
	
		// read all
	}
	public void remove(int id) {
		List<Product> list=findAll();
		Product p =null;
		try {
			Connection c= JdbcUtil.getConnection();
			String query = "delete from product where product_id=?";
			PreparedStatement ps= c.prepareStatement(query,Statement.RETURN_GENERATED_KEYS );
			ps.setInt(1, id);
			int res=ps.executeUpdate();
			if(res!=0) {
				list.remove(id);
			}	
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
	}
//	public void update(Product updated) {
//		//update
//		int generatedId=0;
//		try {
//			Connection c=  JdbcUtil.getConnection();
//
//			
//			String query1 = "update product set qoh=? where id=?";
//			PreparedStatement ps= c.prepareStatement(query1,Statement.RETURN_GENERATED_KEYS); // asking to return the generated keyssssssss
//	
//			ps.setString(1,updated.getName());
//			ps.setFloat(2, updated.getPrice());
//			ps.setInt(3, updated.getQoh());
//			ps.executeUpdate();
//
//			ResultSet keys =ps.getGeneratedKeys(); // returns the n coloumns if there are n auto increment parameters
//			keys.next();
//			generatedId= keys.getInt(1);
//			
//	
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		return generatedId;
//		
//		
//	}
//	
	private static Product mapRow(ResultSet res) throws SQLException {
		Product p;
		p=new Product();
p.setId(res.getInt(1));
p.setName(res.getString(2));
p.setPrice(res.getFloat(3));
p.setQoh(res.getInt(4));
		return p;
	}

}
