package com.raj;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

// This filter will intercept any request sent to /RegistrationServlet
@WebFilter("/RegistrationServlet")
public class InputValidationFilter implements Filter {

    public void init(FilterConfig fConfig) throws ServletException {
        // Initialization code (if any)
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
            throws IOException, ServletException {
        
        HttpServletRequest req = (HttpServletRequest) request;
        PrintWriter out = response.getWriter();
        
        // 1. Fetch input data
        String username = req.getParameter("username");
        String ageStr = req.getParameter("age");

        // 2. Perform Server-Side Validation
        boolean isValid = true;
        String errorMessage = "";

        if (username == null || username.trim().isEmpty()) {
            isValid = false;
            errorMessage = "Username cannot be empty!";
        } else if (ageStr == null || !ageStr.matches("\\d+")) {
            isValid = false;
            errorMessage = "Age must be a valid number!";
        }

        // 3. Decision Logic
        if (!isValid) {
            response.setContentType("text/html");
            out.println("<h3 style='color:red;'>Validation Error: " + errorMessage + "</h3>");
            out.println("<a href='index.html'>Go Back</a>");
            // We do NOT call chain.doFilter(), so the request NEVER reaches the Servlet
        } else {
            // Data is valid! Pass the request to the next filter or the target Servlet
            chain.doFilter(request, response);
        }
    }

    public void destroy() {
        // Cleanup code
    }
}