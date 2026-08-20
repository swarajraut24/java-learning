 package com.tca;
 import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Page2Servlet")
 public class Page2Servlet extends HttpServlet {

     protected void doPost(HttpServletRequest request, HttpServletResponse response)
             throws ServletException, IOException {

         String address = request.getParameter("address");
         String city = request.getParameter("city");

         
         HttpSession session = request.getSession();
         String name = (String) session.getAttribute("name");
         String email = (String) session.getAttribute("email");
 
         try {
              
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection(
                 "jdbc:mysql://localhost:3306/exam","root","root");

             String query = "INSERT INTO users(name, email, address, city) VALUES (?, ?, ?, ?)";
             PreparedStatement ps = con.prepareStatement(query);

             ps.setString(1, name);
             ps.setString(2, email);
             ps.setString(3, address);
             ps.setString(4, city);

             ps.executeUpdate();

             con.close();

             response.getWriter().println("Data Saved Successfully!");

         } catch (Exception e) {
             e.printStackTrace();
         }
     }
 }
 
 