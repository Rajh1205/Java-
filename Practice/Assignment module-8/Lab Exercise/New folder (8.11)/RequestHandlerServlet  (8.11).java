package com.raj;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ProcessRequest")
public class RequestHandlerServlet extends HttpServlet {

    // Handles GET Requests: Usually for fetching or viewing data
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html><head><title>GET Method</title></head><body>");
        out.println("<h2>Handling GET Request</h2>");
        out.println("<p>You accessed this page via a GET request.</p>");
        out.println("<p>Data is visible in the URL as a query string.</p>");
        out.println("<a href='index.html'>Go back to Form</a>");
        out.println("</body></html>");
    }

    // Handles POST Requests: Usually for sensitive or large data submissions
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Accepting parameter from the form
        String user = request.getParameter("username");

        out.println("<html><head><title>POST Method</title></head><body>");
        out.println("<h2 style='color:green;'>Handling POST Request</h2>");
        out.println("<p>Welcome, <b>" + user + "</b>!</p>");
        out.println("<p>Data was sent securely in the request body, not the URL.</p>");
        out.println("<a href='index.html'>Go back</a>");
        out.println("</body></html>");
    }
}