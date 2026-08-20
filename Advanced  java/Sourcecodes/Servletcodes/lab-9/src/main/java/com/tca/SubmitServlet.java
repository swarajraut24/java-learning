package com.tca;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SubmitServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        String q1 = request.getParameter("q1");
        String q2 = request.getParameter("q2");

        session.setAttribute("q1", q1);
        session.setAttribute("q2", q2);

        long start = (Long)session.getAttribute("startTime");
        long end = System.currentTimeMillis();

        long timeTaken = (end - start)/1000;

        request.setAttribute("time", timeTaken);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}