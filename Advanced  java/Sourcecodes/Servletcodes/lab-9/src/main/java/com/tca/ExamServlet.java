package com.tca;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ExamServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        if(session == null || session.getAttribute("user") == null){
            response.sendRedirect("login.jsp");
            return;
        }

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Online Exam</h2>");

        out.println("<form action='" + response.encodeURL("submit") + "' method='post'>");

        out.println("Q1: 2+2 = ?");
        out.println("<input type='radio' name='q1' value='3'>3");
        out.println("<input type='radio' name='q1' value='4'>4<br><br>");

        out.println("Q2: Java is?");
        out.println("<input type='radio' name='q2' value='language'>Language");
        out.println("<input type='radio' name='q2' value='animal'>Animal<br><br>");

        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");

        out.println("<br><a href='logout'>Logout</a>");

        out.println("</body></html>");
    }
}