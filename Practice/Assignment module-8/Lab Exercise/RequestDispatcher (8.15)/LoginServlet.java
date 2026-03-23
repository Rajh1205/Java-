package com.raj;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String user = request.getParameter("userid");
        String pass = request.getParameter("password");

        // Simple Validation Logic
        if (pass.equals("admin123")) {
            // SUCCESS: Forward to a welcome page
            RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
            rd.forward(request, response);
        } else {
            // FAILURE: Include an error message back on the login page
            out.println("<h4 style='color:red;'>Invalid Username or Password!</h4>");
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.include(request, response);
        }
    }
}