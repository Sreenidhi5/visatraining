package com.visa.training.web;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigReader extends HttpServlet{
@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
ServletConfig config= getServletConfig();
	String initParamValue= config.getInitParameter("user");
	
	ServletContext application=getServletContext();
	String contextParamValue= application.getInitParameter("Company");
	
	 PrintWriter out = response.getWriter();
     out.println("User : "+initParamValue);
	
}
}
