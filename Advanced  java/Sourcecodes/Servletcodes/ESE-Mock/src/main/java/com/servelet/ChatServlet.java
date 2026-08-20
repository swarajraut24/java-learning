package com.servelet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ChatServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String message = request.getParameter("message");

        try {
            Connection con = com.tca.DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO messages(username, message) VALUES (?, ?)"
            );

            ps.setString(1, username);
            ps.setString(2, message);
            ps.executeUpdate();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}