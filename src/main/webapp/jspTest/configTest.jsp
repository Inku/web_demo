<%--
  Created by IntelliJ IDEA.
  User: zhengpeng
  Date: 15/4/3
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>config test</title>
</head>
<body>
<%=config.getInitParameter("name")%><br/>
<%=config.getInitParameter("age")%>
</body>
</html>
