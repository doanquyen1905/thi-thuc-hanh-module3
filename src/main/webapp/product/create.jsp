<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
  <title>Thêm sản phẩm</title>
  <meta charset="utf-8">
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
      </div>
    </div>
  </div>
</nav>
<div class="container">
  <form method="post" action="/product?action=create">
    <div class="mb-3">
      <label for="name_product" class="form-label">Tên sản phẩm</label>
      <input type="text" class="form-control" id="name_product" name="name_product" required maxlength="100">
    </div>
    <div class="mb-3">
      <label for="price_product" class="form-label">Giá (lớn hơn 100)</label>
      <input type="number" class="form-control" id="price_product" name="price_product" min="101" required>
    </div>
    <div class="mb-3">
      <label for="discount" class="form-label">Chiết khấu (%)</label>
      <select name="discount" id="discount" class="form-select">
        <option value="5">5%</option>
        <option value="10">10%</option>
        <option value="15">15%</option>
        <option value="20">20%</option>
      </select>
    </div>
    <div class="mb-3">
      <label for="stock" class="form-label">Số lượng tồn kho (lớn hơn 10)</label>
      <input type="number" class="form-control" id="stock" name="stock" min="11" required>
    </div>
    <button type="submit" class="btn btn-primary">Thêm</button>
  </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>