<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP Features Demo</title>
    <style>
        .box { border: 1px solid #ccc; padding: 10px; margin-bottom: 10px; border-radius: 5px; }
        th { background-color: #f2f2f2; }
    </style>
</head>
<body>

    <h1>JSP: JSTL, Scriptlets, and Implicit Objects</h1>

    <div class="box">
        <h3>1. Scriptlet Section</h3>
        <%
            // This is Java code inside a scriptlet
            List<String> frameworkList = new ArrayList<>();
            frameworkList.add("Spring Boot");
            frameworkList.add("Hibernate");
            frameworkList.add("Struts");
            frameworkList.add("JSF");
            
            // Adding the list to an implicit object (request scope) so JSTL can see it
            request.setAttribute("frameworks", frameworkList);
            
            out.println("<p>List created in Scriptlet and stored in Request Scope.</p>");
        %>
    </div>

    <div class="box">
        <h3>2. JSTL Iteration Section</h3>
        <table border="1">
            <tr>
                <th>Index</th>
                <th>Java Framework Name</th>
            </tr>
            <c:forEach var="item" items="${frameworks}" varStatus="status">
                <tr>
                    <td>${status.count}</td>
                    <td><c:out value="${item}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>

    <div class="box">
        <h3>3. Implicit Objects Section</h3>
        <ul>
            <li><strong>Server Info (application):</strong> <%= application.getServerInfo() %></li>
            <li><strong>User Agent (request):</strong> <%= request.getHeader("User-Agent") %></li>
            <li><strong>Remote IP (request):</strong> <%= request.getRemoteAddr() %></li>
            <li><strong>Session ID (session):</strong> <%= session.getId() %></li>
            <li><strong>Context Path (request):</strong> ${pageContext.request.contextPath}</li>
        </ul>
    </div>

</body>
</html>