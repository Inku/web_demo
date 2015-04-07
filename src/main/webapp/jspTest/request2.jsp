<%--
  Created by IntelliJ IDEA.
  User: zhengpeng
  Date: 15/4/7
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>get request</title>
</head>
<body>
<%
  String name = request.getParameter("name");
  String gender = request.getParameter("gender");
%>

name:<%=name%>
gender:<%=gender%>
</body>
</html>
