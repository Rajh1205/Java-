package com.raj;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

// This filter monitors the specific URL of your processing servlet
@WebFilter("/ProcessRegistration")
public class EmptyFieldFilter implements Filter {

    public void init(FilterConfig fConfig) throws ServletException {}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
            throws IOException, ServletException {
        
        HttpServletRequest req = (HttpServletRequest) request;
        
        // 1. Retrieve the form parameters
        String user = request.getParameter("username");
        String email = request.getParameter("email");

        // 2. Check if any field is null or empty
        if (user == null || user.trim().isEmpty() || email == null || email.trim().isEmpty()) {
            
            // 3. Set an error message attribute
            request.setAttribute("error", "All fields are mandatory. Please try again.");
            
            // 4. Forward back to the input form (index.jsp)
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
            
            // IMPORTANT: We do NOT call chain.doFilter() here. 
            // The request stops here and never reaches the Servlet.
        } else {
            // 5. Data is present! Proceed to the next step in the chain (the Servlet)
            chain.doFilter(request, response);
        }
    }

    public void destroy() {}
}
