package com.example.demo;

import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;  

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//With @WebServlet annotation the webapp/WEB-INF/web.xml is no longer required.
@WebServlet(name = "HelloAppEngine", value = "/hello")
public class HelloAppEngine extends HttpServlet {

@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)
   throws ServletException, IOException {

	response.setContentType("text/html");//setting the content type  
	PrintWriter pw=response.getWriter();//get the stream to write the data  
	  
	//writing html in the stream  
	pw.println("<html><body>");  
	pw.println("Welcome to servlet");  
	pw.println("</body></html>");  
	  
	pw.close();//closing the stream  
	}

}
