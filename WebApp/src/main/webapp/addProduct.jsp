<%--
  Created by IntelliJ IDEA.
  User: dyanakiev
  Date: 6/6/2024
  Time: 9:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddProduct</title>
</head>
<body>

    <form action="product-servlet" method="post">
        <label for="productId">Product Id:</label><br>
        <input type="number" id="productId" name="productId"><br>

        <label for="productName">Product Name:</label><br>
        <input type="text" id="productName" name="productName"><br>

        <label for="productPrice">Product Price:</label><br>
        <input type="number" id="productPrice" name="productPrice"><br>

        <input type="submit" value="Add">
    </form>
</body>
</html>
