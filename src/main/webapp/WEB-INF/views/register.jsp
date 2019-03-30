<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: oleksandrkh
  Date: 2019-03-11
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Registration Page</title>

    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/static/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<c:url value="/resources/static/bootstrap/css/signin.css"/>" rel="stylesheet">
</head>

<body class="text-center">
  <spring:form class="form-signin" method="post" modelAttribute="userRegistration">
    <h1 class="h3 mb-3 font-weight-normal">Please enter your</h1>

    <spring:errors path="*" cssStyle="color: red" cssClass="errorblock" element="div" />

    <c:if test="${error != null}">
        <p style="color: red">${error}</p>
    </c:if>

    <label for="inputUsername" class="sr-only">Username</label>
    <spring:input path="username" id="inputUsername" class="form-control" placeholder="Username"/>
    <label for="inputPassword" class="sr-only">Password</label>
    <spring:input path="password" type="password" id="inputPassword" class="form-control" placeholder="Password"/>
    <label for="inputPassword" class="sr-only">Repeat Password</label>
    <spring:input path="repeatPassword" type="password" id="inputPassword" class="form-control" placeholder="Repeat Password"/>
    <label for="firstName" class="sr-only">First Name</label>
    <spring:input path="firstName" type="text" id="firstName" class="form-control" placeholder="First Name"/>
    <label for="lastName" class="sr-only">Last Name</label>
    <spring:input path="lastName" type="text" id="lastName" class="form-control" placeholder="Last Name"/>

    <button class="btn btn-lg btn-primary btn-block mt-4" type="submit">Register</button>
    <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
  </spring:form>
</body>
</html>
