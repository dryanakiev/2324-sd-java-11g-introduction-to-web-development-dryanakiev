<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <jsp:include page="navbar.jsp"/>
    <h1><%= "Hello World!" %></h1><br/>
    <a href="hello-servlet">Show hidden information</a>
</body>
</html>