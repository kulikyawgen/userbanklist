<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Bank list</title>
</head>
<body>
<form action="/getRichestUser" method="get">
    <input type="submit" name="action" value="get richest User">
</form>
<form action="/getAccountSum" method="get">
    <input type="submit" name="action" value="get accounts sum" >
</form>
</body>
</html>