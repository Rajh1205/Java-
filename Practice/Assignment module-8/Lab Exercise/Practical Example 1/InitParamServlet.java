package com.raj;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InitParamServlet extends HttpServlet {

    private String dbUser;
    private String uploadPath;

    // Overriding the init method to fetch parameters once at startup
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        
        // Fetching local parameters from web.xml
        dbUser = config.getInitParameter("databaseUser");
        uploadPath = config.getInitParameter("fileUploadDir");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>ServletConfig Demo</title></head><body>");
        out.println("<h2>Fetching Parameters via ServletConfig</h2>");
        out.println("<table border='1' cellpadding='10'>");
        out.println("<tr><th>Parameter Name</th><th>Value from web.xml</th></tr>");
        out.println("<tr><td>databaseUser</td><td>" + dbUser + "</td></tr>");
        out.println("<tr><td>fileUploadDir</td><td>" + uploadPath + "</td></tr>");
        out.println("</table>");
        out.println("<p><i>Note: These parameters are only accessible by InitParamServlet.</i></p>");
        out.println("</body></html>");
    }
}