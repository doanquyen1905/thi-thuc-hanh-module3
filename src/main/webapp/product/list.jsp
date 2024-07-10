<%--
  Created by IntelliJ IDEA.
  User: quyen
  Date: 7/2/2024
  Time: 8:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh sách Sản phẩm</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Trang chủ</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup"
                aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-link active" aria-current="page" href="/product">Sản phẩm</a>
                <!-- Add other navigation links as needed -->
            </div>
        </div>
        <div class="d-flex">
            <button class="btn btn-primary me-2" onclick="window.location.href='/product?action=create'">Thêm mới sản phẩm</button>
            <button class="btn btn-success me-2" onclick="window.location.href='/product/top-selling'">Top sản phẩm bán chạy</button>
            <button class="btn btn-info me-2" onclick="window.location.href='/product/ordered'">Sản phẩm đã đặt hàng</button>
        </div>
    </div>
</nav>
<div class="container">
    <button class="btn btn-primary mt-4" onclick="window.location.href='/product?action=create'">Thêm</button>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>Số thứ tự</th>
<%--            <th>Mã</th>--%>
            <th>Name</th>
            <th>Price</th>
            <th>Discount</th>
            <th>Stock</th>
<%--            <th>Học lực</th>--%>
<%--            <th>Chức năng</th>--%>
        </tr>
        </thead>
        <tbody>
        <%--@elvariable id="students" type="java.util.List"--%>
        <c:forEach var="product" items="${products}" varStatus="status">
            <tr>
                <td>${status.count}</td>
<%--                <td>${student.id}</td>--%>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>${product.discount}</td>
                <td>${product.stock}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</html>
