<%@ page import="java.util.Enumeration" %>
<%--
  Created by IntelliJ IDEA.
  User: zhengpeng
  Date: 15/4/7
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<%
    Enumeration<String> headerNames = request.getHeaderNames();
    while (headerNames.hasMoreElements()) {
        String headName = headerNames.nextElement();
        out.println(headName + "-->" + request.getHeader(headName) + "<br/>");
    }
    out.println("<hr/>");
    request.setCharacterEncoding("utf-8");
    String name = request.getParameter("name");
    String gender = request.getParameter("gender");
    String[] color = request.getParameterValues("color");
    String national = request.getParameter("country");
%>
name:<%=name%>
<hr/>
gender:<%=gender%>
<hr/>
<%
    for (String c : color) {
        out.println(c + ",");
    }
%>
<hr/>
country:<%=national%>
<hr/>

</body>
<head>
    <title> request header/params </title>
</head>
</html>
