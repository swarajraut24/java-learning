package com.tca;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tca.entities.login;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
 
@WebServlet("/display")
public class displayservelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		String username=request.getParameter("name");
		String password=request.getParameter("pwd");
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		final String DB_URL="jdbc:postgresql://localhost:5432/login";
		final String DB_USER="postgres";
		final String DB_PWD="root";
		final String DB_DRIVER= "org.postgresql.Driver";
		
		String qry="select * from  information ORDER BY id";
		
		 
		
		try {
		
		Class.forName(DB_DRIVER);
		
		con=DriverManager.getConnection(DB_URL,DB_USER,DB_PWD);
		
		ps=con.prepareStatement(qry);
		rs=ps.executeQuery();
		
		String name=null;
		 String Password=null;
		 
		boolean valid=false;
		
		while(rs.next()) {  
			 if(username.equals(rs.getString("name")) && password.equals(rs.getString("password"))) {	 
			 response.sendRedirect("dashboard.jsp");
			 valid=true;
			 break;	 
		 }
			 else {
				 name="123";
			 }
		}
			 if(!valid) {
				 request.setAttribute("name",name);
			        RequestDispatcher rd=request.getRequestDispatcher("./Login.jsp");
					rd.forward(request, response);
					 out.close();
					 
			 }
		}
	
		
		
		
		catch(Exception e) { 
				e.printStackTrace();
			}
		
		finally {
			 try {
				 rs.close();
				con.close();
			 } catch (SQLException e) {
				e.printStackTrace();
			 }
		 }
		
		
	}
	
		}
		
	


