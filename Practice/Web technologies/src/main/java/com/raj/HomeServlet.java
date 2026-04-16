package com.raj;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class HomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        ServletContext context = getServletContext();
        String pName = context.getInitParameter("projectName");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Welcome to " + pName + "</h1>");
        out.println("<p>This is the Home Page using shared context data.</p>");
        out.println("<a href='contact'>Go to Contact Page</a>");
    }
}