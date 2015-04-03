<%--
  Created by IntelliJ IDEA.
  User: zhengpeng
  Date: 15/4/3
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>put app</title>
</head>
<body>
<%! int i;%>
<%application.setAttribute("counter", String.valueOf(++i));%>
<%=i%>
</body>
</html>
