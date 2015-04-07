<%--
  Created by IntelliJ IDEA.
  User: zhengpeng
  Date: 15/4/7
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>page context</title>
</head>
<body>
  <%
    pageContext.setAttribute("page", "hello");
    pageContext.setAttribute("request2", "hello", pageContext.REQUEST_SCOPE);
  %>
</body>
</html>
