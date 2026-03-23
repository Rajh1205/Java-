package com.raj;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ConfigDemoServlet extends HttpServlet {

    private String databaseURL;
    private String adminEmail;

    // The init method is where we usually fetch ServletConfig parameters
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        
        // Fetching parameters defined in web.xml
        databaseURL = config.getInitParameter("dbURL");
        adminEmail = config.getInitParameter("adminEmail");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>ServletConfig Parameter Demo</h2>");
        out.println("<p><strong>Database URL:</strong> " + databaseURL + "</p>");
        out.println("<p><strong>Admin Contact:</strong> " + adminEmail + "</p>");
        out.println("<p><em>These values were fetched from web.xml during init().</em></p>");
        out.println("</body></html>");
    }
}