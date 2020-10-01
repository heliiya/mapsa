<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>products list</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>id</th>
                <th>name</th>
                <th>category</th>
                <th>detail</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${products}" var="product">
                <tr>
                    <td>${product.id}</td>
                    <td>${product.name}</td>
                    <td>${product.category}</td>
                    <td>
                        <a href="<spring:url value="/product/${product.id}" />" >
                            ssss
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
