package com.tca;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		
		if(uname.equals("swaraj") &&  pwd.equals("raut")) {
//			response.sendRedirect("http://localhost:8080/ASS05-Login-App/Home");
			RequestDispatcher rd=request.getRequestDispatcher("./Home");
			rd.forward(request, response);
		}
		else {
			out.println("<script> alert('Login Failed')</script>");
			out.println("<form method=\"POST\" action=\"./Login\">\r\n"
					+ "  \r\n"
					+ "  Username:<input type=\"text\" name=\"uname\"><br>\r\n"
					+ "  Password:<input type=\"password\" name=\"pwd\"> <br>\r\n"
					+ "  \r\n"
					+ "  <input type=\"submit\" Value=\"Login\">\r\n"
					+ "  \r\n"
					+ "  \r\n"
					+ "  </form>");
		}
		
		out.close();
	}

}
