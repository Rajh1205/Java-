package com.raj;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/GetData")
public class GetContextServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // 1. Get the same ServletContext object
        ServletContext context = getServletContext();

        // 2. Retrieve the data using the keys
        String title = (String) context.getAttribute("appTitle");
        String time = (String) context.getAttribute("serverStartTime");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Reading from Global Context:</h2>");
        out.println("<p>Project Title: <b>" + title + "</b></p>");
        out.println("<p>Session started at: " + time + "</p>");
    }
}