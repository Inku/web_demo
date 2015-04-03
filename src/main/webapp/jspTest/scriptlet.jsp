<%--
  Created by IntelliJ IDEA.
  User: zhengpeng
  Date: 15/4/3
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>scriptlet</title>
</head>
<body>
<%
    for (int i = 0; i < 10; i++) {
%>
<tr>
    <td>count:</td>
    <td><%=i%></td>
</tr>
<%}%>
</body>
</html>
