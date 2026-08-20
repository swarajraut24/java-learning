package com.tca;
 import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

public class Page1Servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");

       
        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        session.setAttribute("email", email);

       
        response.sendRedirect("page2.jsp");
    }
}