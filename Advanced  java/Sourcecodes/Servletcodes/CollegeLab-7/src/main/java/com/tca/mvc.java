package  com.tca;

import java.io.IOException;

import com.entities.contact;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/MVC")

public class mvc extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        contact c = new contact();

        c.setName(name);
        c.setEmail(email);
        c.setMessage(message);

        request.setAttribute("contact", c);

        request.getRequestDispatcher("thankyou.jsp").forward(request, response);
    }
}