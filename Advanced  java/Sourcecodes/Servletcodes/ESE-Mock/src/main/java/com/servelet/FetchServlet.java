package com.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FetchServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/plain");

        try {
            Connection con = com.tca.DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM messages ORDER BY timestamp ASC");

            PrintWriter out = response.getWriter();

            while(rs.next()) {
                out.println(
                    rs.getString("username") + ":" +
                    rs.getString("message")
                );
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}