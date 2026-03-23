<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<body>
    <h2>User Registration</h2>

    <% 
        String msg = (String) request.getAttribute("error");
        if(msg != null) { 
    %>
        <p style="color:red;"><%= msg %></p>
    <% } %>

    <form action="ProcessRegistration" method="POST">
        Username: <input type="text" name="username"><br><br>
        Email: <input type="text" name="email"><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>