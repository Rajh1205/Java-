package com.raj;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ContactServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        ServletContext context = getServletContext();
        String pName = context.getInitParameter("projectName");
        String email = context.getInitParameter("supportEmail");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Contact " + pName + " Support</h1>");
        out.println("<p>Please email us at: <b>" + email + "</b></p>");
        out.println("<a href='home'>Back to Home</a>");
    }
}