package com.raj;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// The @WebServlet annotation defines the URL pattern to access this servlet
@WebServlet("/GreetingServlet")
public class GreetingServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // 1. Set the response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // 2. Accept parameters sent from the user (HTML form)
        String name = request.getParameter("userName");
        String language = request.getParameter("language");

        // 3. Handle null or empty values
        if (name == null || name.isEmpty()) {
            name = "Guest";
        }

        // 4. Generate the HTML response
        out.println("<html><head><title>Servlet Response</title></head><body>");
        out.println("<h1>Hello, " + name + "!</h1>");
        out.println("<p>It's great to know that you enjoy coding in <strong>" + language + "</strong>.</p>");
        out.println("<br><a href='index.html'>Back to Form</a>");
        out.println("</body></html>");
    }
}