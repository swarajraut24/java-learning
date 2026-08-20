package com.tca;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({ "/addtwonumbers", "/add" })
public class addtwonumbers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		String f1=request.getParameter("first");
		
		String f2=request.getParameter("second");
		
		if(f1.isEmpty() || f2.isEmpty()) {
			out.println("<h1>please enter a number!<h1>");
		}
		else {
			int a=Integer.parseInt(f1);
			
			int b=Integer.parseInt(f2);
			
			int c =a+b;
			
			out.println("<h1>Addition is:"+c+"<h1>");
		}
		
	 
		
	}

}
