package com.tca;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
 
@WebServlet("/Page2")
public class Page2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  response.setContentType("text/html");
	  
	  PrintWriter out=response.getWriter();
	  
	  String values[]=request.getParameterValues("Lbook");
	  
	  int ltotal=0;
	  
	  for(int i=0;i<values.length;i++) {
		  ltotal=ltotal+Integer.parseInt(values[i]);
	  }
	  
	  HttpSession hs=request.getSession(true);
	  
	  hs.setAttribute("P1total", ltotal);
	  
	  //second form
	  
	  out.println("<h1> PAGE 2 SERVELT & JSP BOOK </h1>");
	  out.println("<form method='GET' action='./Page3'>");
	  out.println("<b> Select books <b><br>");
	  out.println("<input type='checkbox' name='sjbook' value='450'> BOOK1 Rs. 450 <br>");
	  out.println("<input type='checkbox' name='sjbook' value='300'> BOOK1 Rs. 300 <br>");
	  out.println("<input type='checkbox' name='sjbook' value='250'> BOOK1 Rs. 250 <br>");
	  out.println("<input type='Submit' value='Payment'>");
	  out.println("</form>");
	  
	  
	  
	  out.close();
	}

}
