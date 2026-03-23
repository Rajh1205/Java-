package com.raj;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/ProcessRegistration")
public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String name = request.getParameter("username");
        response.setContentType("text/html");
        response.getWriter().println("<h1>Success! Welcome, " + name + "</h1>");
    }
}