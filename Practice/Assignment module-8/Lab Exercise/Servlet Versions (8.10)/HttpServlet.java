package com.raj;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/HttpDemo")
public class HttpDemo extends HttpServlet {
    
    // You override specific HTTP methods
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html><body>");
        out.println("<h2>Response from HttpServlet</h2>");
        out.println("<p>This servlet handles specific HTTP GET requests.</p>");
        out.println("</body></html>");
    }
}