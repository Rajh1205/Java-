<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h2>Login Form</h2>
    
    <div style="color:red;">
        <%-- The servlet can write content here using RequestDispatcher.include() --%>
    </div>

    <form action="LoginServlet" method="POST">
        Username: <input type="text" name="userid"><br><br>
        Password: <input type="password" name="password"><br><br>
        <input type="submit" value="Login">
    </form>
</body>
</html>