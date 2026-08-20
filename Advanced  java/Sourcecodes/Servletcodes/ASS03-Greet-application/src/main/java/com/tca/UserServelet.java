package com.tca;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
 
@WebServlet("/user")
public class UserServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String un= request.getParameter("uname");
		
		if(un.isEmpty()) {
			out.println("<h1>String not exist<h1>");
	
		}
		else {
			out.println("<h1>POST---> Hello, " +un+ "<h1>");
		}
		out.close();
	}

}
