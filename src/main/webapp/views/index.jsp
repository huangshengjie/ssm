<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link href="/css/test.css" rel="stylesheet" type="text/css">
</head>
<body>
<h2 id="hello">Hello World!</h2>
<table>
    <thead>
    <th>
    <td>id</td>
    <td>name</td>
    <td>age</td>
    </th>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>