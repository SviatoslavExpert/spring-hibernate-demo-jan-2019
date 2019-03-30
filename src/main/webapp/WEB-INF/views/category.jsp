<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: oleksandrkh
  Date: 2019-02-21
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Category</title>
</head>
<body>

<h3>Category name: <c:out value="${category.categoryName}"/></h3>
<p>Description: <c:out value="${category.description}"/></p>
    <c:forEach items="${category.products}" var="p">
        <p><c:out value="${p.productName}"/></p>
        <p><c:out value="${p.price}"/></p>
        <hr/>
        <br/>
    </c:forEach>

    <h1><a href="<c:url value="/reduce?c_id=${category.id}"/>">Reduce</a> 10% price</h1>

</body>
</html>