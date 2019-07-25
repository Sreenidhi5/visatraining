package com.visa.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import com.visa.training.jdbc.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.visa.training.jdbc.Product;

@WebServlet("/product")
public class DisplayProduct extends HttpServlet {
	
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 Product p = new Product();
		 String i = request.getParameter("name");
		 String j = request.getParameter("price");
		 String k = request.getParameter("qoh");
		 
		 PrintWriter out= response.getWriter();
		 
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
