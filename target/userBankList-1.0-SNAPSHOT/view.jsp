<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Bank list</title>
</head>
<body>
<form action="/dispatcher" method="get">
    <input type="submit" name="action" value="get richest User">
</form>
<form action="/dispatcher" method="get">
    <input type="submit" name="action" value="get accounts sum" >
</form>
</body>
</html>