package com.raj;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/GenericDemo")
public class GenericDemo extends GenericServlet {
    
    // You MUST override the service method
    @Override
    public void service(ServletRequest request, ServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html><body>");
        out.println("<h2>Response from GenericServlet</h2>");
        out.println("<p>This servlet is protocol-independent.</p>");
        out.println("</body></html>");
    }
}