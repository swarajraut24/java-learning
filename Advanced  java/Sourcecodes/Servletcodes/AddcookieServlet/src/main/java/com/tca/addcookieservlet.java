package com.tca;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
@WebServlet("/cookies")
public class addcookieservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 
//		 Cookie ck1=new Cookie("sachin","dhane");
//		 Cookie ck2=new Cookie("sourabh","deo");
//		 
//		 ck1.setPath("/");
//		 ck2.setPath("/");
//		 
//		 response.addCookie(ck1);
//		 response.addCookie(ck2);
//		 
//		 
		 Cookie ck3=new Cookie ("sachin", "");
		 ck3.setPath("/");
		 ck3.setMaxAge(0);
		 response.addCookie(ck3);
	 
		 
		 out.println("<h1>Cookies are saved</h1>");
		 
		 out.close();
	}

}
