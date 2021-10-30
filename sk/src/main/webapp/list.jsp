<%@page import="services.CustomerService"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/5.1.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Customers</h2>
         
  <table class="table table-striped table-hover">
    <thead>
      <tr>
        <th>Id</th>
        <th>name</th>
        <th>Password</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="customer" items="${customers}">
     
    <tr>
    <td> ${customer.getId()}</td>
    <td> ${customer.getName()}</td>
    <td> ${customer.getPassword()}</td>
     </tr>
     
</c:forEach>
    </tbody>
  </table>
  <h3><a href="/sk">back</a></h3>
</div>


</body>
</html>