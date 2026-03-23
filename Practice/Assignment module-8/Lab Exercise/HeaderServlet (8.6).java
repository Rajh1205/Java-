package com.raj;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/HeaderServlet")
public class HeaderServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // 1. Send an HTTP response with CUSTOM headers
        response.setContentType("text/html");
        response.setHeader("X-Assignment-Author", "YourName");
        response.setHeader("X-Server-Status", "Operational");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>HTTP Request Headers Received:</h2>");
        out.println("<table border='1' cellpadding='5'>");
        out.println("<tr><th>Header Name</th><th>Header Value</th></tr>");

        // 2. Display the HTTP request headers
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String paramName = headerNames.nextElement();
            String paramValue = request.getHeader(paramName);
            
            out.println("<tr><td>" + paramName + "</td>");
            out.println("<td>" + paramValue + "</td></tr>");
        }

        out.println("</table>");
        out.println("<p>Check the Browser Network Tab to see the <strong>Custom Response Headers</strong>.</p>");
        out.println("</body></html>");
    }
}