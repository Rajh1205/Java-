package com.raj;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/SetData")
public class SetContextServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // 1. Get the ServletContext object
        ServletContext context = getServletContext();

        // 2. Store data in the context (Key, Value)
        context.setAttribute("appTitle", "Enterprise Portal v2.0");
        context.setAttribute("serverStartTime", new java.util.Date().toString());

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h3>Data has been set in the Global Context!</h3>");
        out.println("<a href='GetData'>Go to the Reader Servlet</a>");
    }
}