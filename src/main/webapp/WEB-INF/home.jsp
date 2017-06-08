<%--
  Created by IntelliJ IDEA.
  User: stone
  Date: 17-6-7
  Time: 下午3:34
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <!--输出,条件,迭代标签库-->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>spittr</title>
  </head>
  <body>
    <h1>Welcome to Spittr!</h1>
    <a href="<c:url value="/spittles" />">Spittles</a>
    <a href="<c:url value="/spitter/register" />">Register</a>
  </body>
</html>
