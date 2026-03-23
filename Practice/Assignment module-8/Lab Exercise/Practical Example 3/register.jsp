<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
    <h2>User Registration Form</h2>
    <form action="RegistrationServlet" method="POST">
        <label>Full Name:</label><br>
        <input type="text" name="fullName" required><br><br>

        <label>Email Address:</label><br>
        <input type="email" name="email" required><br><br>

        <label>City:</label><br>
        <input type="text" name="city"><br><br>

        <input type="submit" value="Register Now">
    </form>
</body>
</html>