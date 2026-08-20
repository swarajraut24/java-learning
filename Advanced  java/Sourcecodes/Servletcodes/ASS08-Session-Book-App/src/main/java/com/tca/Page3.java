package com.tca;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

 
@WebServlet("/Page3")
public class Page3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		  
		  PrintWriter out=response.getWriter();
		   
		  String values[]=request.getParameterValues("sjbook");
		  
		  int sjtotal=0;
		  
		  for(int i=0;i<values.length;i++) {
			  sjtotal=sjtotal+Integer.parseInt(values[i]);
		  }
		  
		  HttpSession hs=request.getSession(false);  //means dont create session use existig once
		  
		int ltotal= Integer.parseInt(hs.getAttribute("P1total").toString());
		
		//Bill logic 
		
		int bill= sjtotal+ltotal;
		
		out.println("<h2>BILL</h2>");
		out.println("Page 1 : Rs."+ltotal+"<br>");
		out.println("Page 2: Rs."+sjtotal+"<br>");
		out.println("Total Bill Amount : Rs."+bill + "<br>");
		
		hs.invalidate(); //destroying session
		
		  out.close();
	}

}



