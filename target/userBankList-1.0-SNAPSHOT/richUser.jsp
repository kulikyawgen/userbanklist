<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<ul>
    <c:forEach var="user" items="${richestUser}">
        <li><c:out value="${user.name} ${user.surname}" /></li>
    </c:forEach>
</ul>
</body>
</html>