 package controller;

import java.io.IOException;
import java.sql.*;
import java.util.*;
import db.DBConnection;
import model.User;
import model.History;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/dashboard") // This is the URL that was causing the 404
public class HistoryServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        if (user == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        List<History> list = new ArrayList<>();

        try (Connection con = DBConnection.getConnection()) {
            // Updated Query: Adjust column names if they differ in your DB
            String sql = "SELECT * FROM history WHERE user_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, user.getId());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                History h = new History();
                h.setProductName(rs.getString("product_name"));
                h.setScore(rs.getInt("score"));
                list.add(h);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Pass the list to the JSP
        request.setAttribute("history", list);
        // Forward to our interactive "All-in-One" page
        request.getRequestDispatcher("dashboard.jsp").forward(request, response);
    }
}