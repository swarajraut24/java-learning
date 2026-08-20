package com.tca;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
@WebServlet("/display")
public class displayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   response.setContentType("text/html");	 
	   
	   PrintWriter out=response.getWriter();
	   
	   Cookie c[]=request.getCookies();
	     
	   if(c==null) {
		   out.println("No cookies saved");
	   }
	   else {
		   out.println("<h1>client side cookies:s</h1>");
		   
		   for(int i=0;i<c.length;i++) {
			   String key=c[i].getName();
			   String value=c[i].getValue();
			   
			   out.println( key+":"+value+"<br>");
		   }
	   }
	   out.close();
	}

}
