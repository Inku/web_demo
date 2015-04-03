<%--
  Created by IntelliJ IDEA.
  User: zhengpeng
  Date: 15/4/3
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp-forward</title>
</head>
<body>
  <jsp:forward page="forward-result.jsp">
    <jsp:param name="age" value="29"/>
  </jsp:forward>
</body>
</html>
