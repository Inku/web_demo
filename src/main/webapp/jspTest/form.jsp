<%--
  Created by IntelliJ IDEA.
  User: zhengpeng
  Date: 15/4/3
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>form</title>
</head>
<body>
<form action="request1.jsp" method="post" id="form1">
  用户名:<br/>
  <input type="text" name="name">
  <hr/>
  性别: <br/>
  男: <input type="radio" name="gender" value="男">
  女: <input type="radio" name="gender" value="女">
  <hr/>
  颜色: <br/>
  红: <input type="checkbox" name="color" value="red">
  绿: <input type="checkbox" name="color" value="green">
  蓝: <input type="checkbox" name="color" value="blue">
  <hr/>
  country: <br/>
  <select name="country">
    <option value="China">China</option>
    <option value="America">America</option>
    <option value="Russia">Russia</option>
  </select>
  <input type="submit" value="submit">
  <input type="reset" value="reset">
</form>
</form>
</body>
</html>
