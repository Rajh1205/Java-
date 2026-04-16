<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<body>
    <h2>Login System</h2>
    <%
        // Check if a cookie exists to pre-fill the username
        String savedUser = "";
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("rememberedUser")) {
                    savedUser = c.getValue();
                }
            }
        }
    %>
    <form action="LoginServlet" method="POST">
        Username: <input type="text" name="user" value="<%= savedUser %>"><br><br>
        Password: <input type="password" name="pass"><br><br>
        <input type="checkbox" name="remember"> Remember Me<br><br>
        <input type="submit" value="Login">
    </form>
    <p style="color:red;">${error}</p>
</body>
</html>