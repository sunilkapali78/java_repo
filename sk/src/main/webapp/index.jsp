<%@page import="java.io.Writer"%>
<%@page import="data.DataBase"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>


 <div class="container">
 <div class="row m-3">
      <div class="col">
      <div class="mt-4 p-5 bg-warning text-dark rounded">
  <h1>Welcome to Laxmi Bank</h1>
  <p>Nepal's Best Bank For Business......</p>
  <h3><a href="HandleReq">View List</a></h3>
</div>
      </div>
      </div>
    <div class="justify-content-center d-flex m-3">
      <div class="">
       <div class="card" style="width:400px">
    <img class="card-img-top" src="images/pic.jpg" alt="Card image" style="height:200px">
    <div class="card-body">
      <h4 class="card-title">sk78</h4>
      <p class="card-text">Some example text some example text. John  is an architect and engineer</p>
      <a href="add.jsp" class="btn btn-primary">More</a>
    </div>
  </div>      </div>
      <div class="">
       <div class="card" style="width:400px">
    <img class="card-img-top" src="images/pic.jpg" alt="Card image" style="height:200px">
    <div class="card-body">
      <h4 class="card-title">sk78</h4>
      <p class="card-text">Some example text some example text. John is an architect and engineer</p>
      <a href="add.jsp" class="btn btn-primary">more</a>
    </div>
  </div>      </div>
    </div>
</body>
</html>

