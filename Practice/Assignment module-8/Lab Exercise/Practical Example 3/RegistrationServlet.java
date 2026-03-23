package com.raj;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // 1. Fetch data from the form
        String name = request.getParameter("fullName");
        String email = request.getParameter("email");
        String city = request.getParameter("city");

        // 2. Process data (e.g., format the name)
        String welcomeMessage = "Registration Successful for " + name.toUpperCase();

        // 3. Store data in the request object to pass it to the next JSP
        request.setAttribute("msg", welcomeMessage);
        request.setAttribute("userEmail", email);
        request.setAttribute("userCity", city);

        // 4. Use RequestDispatcher to FORWARD the request to display.jsp
        RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
        rd.forward(request, response);
    }
}