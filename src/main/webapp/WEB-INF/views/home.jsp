<%--
  Created by IntelliJ IDEA.
  User: jotaiwan
  Date: 18/06/2017
  Time: 12:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="false" %>
<html>
<head>
    <title>Spittr</title>
    <link ref="stylesheet" type="t3ext/css" href="<c:url value="/resources/style.css" />" >
</head>
<body>
<h1>Welcome to Spittr</h1>

<a href="<c:url value="/spittles"/>">Spittles</a>
<a href="<c:url value="/spitter/register" />">Register</a>
</body>
</html>
