 package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import db.DBConnection;
import model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/updateProfile")
public class UpdateProfileServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        
        if (user == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        try {
            double weight = Double.parseDouble(request.getParameter("weight"));
            double height = Double.parseDouble(request.getParameter("height"));

            try (Connection con = DBConnection.getConnection()) {
                String sql = "UPDATE users SET weight=?, height=? WHERE id=?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setDouble(1, weight);
                ps.setDouble(2, height);
                ps.setInt(3, user.getId());
                ps.executeUpdate();
                
                // Update Session so UI changes instantly
                user.setWeight(weight);
                user.setHeight(height);
                session.setAttribute("user", user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.sendRedirect("dashboard");
    }
}