 package controller;

 

import model.Product;
import model.User;
import service.*;

import java.io.IOException;

import dao.HistoryDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/product")
public class ProductServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String barcode = request.getParameter("barcode");

        // API call
        Product product = ProductService.getProductByBarcode(barcode);

        // AI analysis
        int score = AnalyzerService.calculateScore(product.getIngredients());
        String category = AnalyzerService.getCategory(score);

        // Get user from session
        User user = (User) request.getSession().getAttribute("user");

        double bmi = BMIService.calculateBMI(user.getWeight(), user.getHeight());

        // Recommendation
        String recommendation;
        if (score < 50 && bmi > 25)
            recommendation = "Avoid this product. It may increase weight.";
        else if (score < 50)
            recommendation = "Not healthy product.";
        else
            recommendation = "Safe in moderation.";

        // Save history
        HistoryDAO.save(user.getId(), product.getName(), barcode, score, category, recommendation);

        // Send data to JSP
        request.setAttribute("product", product);
        request.setAttribute("score", score);
        request.setAttribute("category", category);
        request.setAttribute("bmi", bmi);
        request.setAttribute("recommendation", recommendation);

        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}