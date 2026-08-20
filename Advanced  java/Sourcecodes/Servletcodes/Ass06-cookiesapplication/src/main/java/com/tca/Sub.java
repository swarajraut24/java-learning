package com.tca;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
@WebServlet("/Sub")
public class Sub extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 
		 String sub= request.getParameter("sb");
		 
		 out.println("you  have selected" +" "+ sub);
		 
		 Cookie c[]=request.getCookies();
		 int cnt;
		 
		 if (c==null) {
			 cnt=1;
		 }
		 else {
			 cnt=c.length+1;
		 }
		 
		 String key="ID"+cnt;
		 
		 Cookie ck=new Cookie(key,sub);
		 ck.setPath("/");
		 response.addCookie(ck);
		 
		 
		 if(c==null) {
			   out.println("No cookies saved");
		   }
		   else {
			   out.println("<h1>client side cookies:s</h1>");
			   
			   for(int i=0;i<c.length;i++) {
				   String ke=c[i].getName();
				   String value=c[i].getValue();
				   
				   out.println( ke+":"+value+"<br>");
			   }
		 
		 out.close();
		 
	}

	}
}
