<%--
  Created by IntelliJ IDEA.
  User: zhengpeng
  Date: 15/4/3
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp incluede2</title>
</head>
<body>
  <jsp:include page="forward-result.jsp">
    <jsp:param name="age" value="32"/>
  </jsp:include>
</body>
</html>
