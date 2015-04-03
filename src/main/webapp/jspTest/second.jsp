<%--
  Created by IntelliJ IDEA.
  User: zhengpeng
  Date: 15/4/3
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>second page</title>
</head>
<body>
<%
    for (int i = 0; i < 7; i++) {
        out.println("<font size='" + i + "'>");
%>
    testfont</font><br/>
<%}%>
</body>
</html>
