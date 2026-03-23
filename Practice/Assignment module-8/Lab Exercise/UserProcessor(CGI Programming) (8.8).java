package com.raj;

import java.util.*;

public class UserProcessor {
    public static void main(String[] args) {
        // 1. Tell the browser what kind of content we are sending
        System.out.println("Content-type: text/html\n");

        // 2. Get the data from the Environment Variable (for GET requests)
        String queryString = System.getenv("QUERY_STRING");

        System.out.println("<html><head><title>CGI Response</title></head><body>");
        System.out.println("<h1>CGI Processing Results</h1>");

        if (queryString == null || queryString.isEmpty()) {
            System.out.println("<p>No data received.</p>");
        } else {
            System.out.println("<p><strong>Raw Query String:</strong> " + queryString + "</p>");
            System.out.println("<h3>Parsed Data:</h3>");
            System.out.println("<ul>");
            
            // 3. Simple parsing of the name=value pairs
            String[] pairs = queryString.split("&");
            for (String pair : pairs) {
                String[] side = pair.split("=");
                String key = side[0];
                String value = (side.length > 1) ? side[1] : "";
                
                // Replace '+' with spaces (URL decoding)
                value = value.replace("+", " ");
                
                System.out.println("<li>" + key + ": " + value + "</li>");
            }
            System.out.println("</ul>");
        }

        System.out.println("<a href='../index.html'>Go Back</a>");
        System.out.println("</body></html>");
    }
}