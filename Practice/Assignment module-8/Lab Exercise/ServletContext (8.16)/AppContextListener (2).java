package com.raj;



import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

// The @WebListener annotation registers this class automatically
@WebListener
public class AppContextListener implements ServletContextListener {

    // 1. Triggered when the Web Application is STARTED
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("==============================================");
        System.out.println("APPLICATION START EVENT: Web App is now LIVE.");
        System.out.println("Time: " + new java.util.Date());
        System.out.println("==============================================");
        
        // Typical use: Initializing a Database Connection Pool
    }

    // 2. Triggered when the Web Application is STOPPED
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("==============================================");
        System.out.println("APPLICATION STOP EVENT: Web App is shutting down.");
        System.out.println("Cleaning up resources...");
        System.out.println("==============================================");
        
        // Typical use: Closing Database Connections or background threads
    }
}