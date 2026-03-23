<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<body>
    <h2 style="color:green;">Login Successful!</h2>
    <h3>Welcome to the Dashboard, <%= request.getParameter("userid") %></h3>
</body>
</html>