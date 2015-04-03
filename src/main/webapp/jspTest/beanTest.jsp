<%@ page import="com.ifeng.cms.module.Person" %>
<%--
  Created by IntelliJ IDEA.
  User: zhengpeng
  Date: 15/4/3
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>bean test</title>
</head>
<body>
<%
  Person p1 = new Person();
  //pageContext.setAttribute("p1", p1);
  p1.setName("wawa");
  p1.setAge(23);
%>

<%=p1.getAge()%>
<%=p1.getName()%>
</body>
</html>
