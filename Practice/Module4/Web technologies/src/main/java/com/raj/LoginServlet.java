package com.raj;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        String remember = request.getParameter("remember");

        // Simple hardcoded authentication
        if (user.equals("admin") && pass.equals("123")) {
            
            // 1. Session Tracking: Keep user logged in
            HttpSession session = request.getSession();
            session.setAttribute("currentUser", user);

            // 2. Cookie Management: Remember username if checkbox is ticked
            if (remember != null) {
                Cookie c = new Cookie("rememberedUser", user);
                c.setMaxAge(60 * 60 * 24); // Persistent cookie for 24 hours
                response.addCookie(c);
            }

            response.sendRedirect("dashboard.jsp");
        } else {
            request.setAttribute("error", "Invalid Credentials!");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}
