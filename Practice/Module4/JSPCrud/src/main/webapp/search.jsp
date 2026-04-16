<%@page import="java.util.*"%>
<%@page import="com.dao.Dao"%>
<%@page import="com.Model.model"%>

<%
    String name = request.getParameter("name");

    List<model> list;

    if(name == null || name.trim().equals("")){
        list = Dao.viewdata();
    } else {
        list = Dao.searchByName(name);
    }

    for(model m : list){
%>
<tr>
    <td><%=m.getId()%></td>
    <td><%=m.getName()%></td>
    <td><%=m.getEmail()%></td>
    <td><%=m.getAddress()%></td>
    <td><%=m.getPhone()%></td>
    <td><a href='edit.jsp?id=<%=m.getId()%>'>Edit</a></td>
    <td><a href='delete.jsp?id=<%=m.getId()%>'>Delete</a></td>
</tr>
<%
    }
%>