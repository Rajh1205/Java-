package com.raj;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LifecycleServlet")
public class LifecycleServlet extends HttpServlet {

    // 1. Called only ONCE when the servlet is first loaded
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("********** init() method called: Servlet is being initialized **********");
    }

    // 2. Called for EVERY request (GET, POST, etc.)
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        System.out.println("---------- service() method called: Processing a request ----------");
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Servlet Lifecycle Demo</h2>");
        out.println("<p>Check your server console/logs to see the lifecycle messages!</p>");
        out.println("</body></html>");
    }

    // 3. Called only ONCE when the server is shutting down or servlet is unloaded
    @Override
    public void destroy() {
        System.out.println("########## destroy() method called: Servlet is being destroyed ##########");
    }
}