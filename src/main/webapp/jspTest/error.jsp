<%--
  Created by IntelliJ IDEA.
  User: zhengpeng
  Date: 15/4/3
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>error page</title>
</head>
<body>
this is errorpage
type:<%=exception.getClass()%><br/>
msg:<%=exception.getMessage()%><br/>
</body>
</html>
