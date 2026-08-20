
package com.tca;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        String remember = request.getParameter("remember");

        if("admin".equals(user) && "1234".equals(pass)) {

            // Session
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            session.setAttribute("startTime", System.currentTimeMillis());

            // Cookie
            if("on".equals(remember)){
                Cookie ck = new Cookie("user", user);
                ck.setMaxAge(60*60*24);
                response.addCookie(ck);
            }

            response.sendRedirect(response.encodeURL("exam"));

        } else {
            response.getWriter().println("Invalid Login");
        }
    }
}