<%--
  Created by IntelliJ IDEA.
  User: heliii
  Date: 8/17/2020
  Time: 10:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add merchant page</title>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <label class="navbar-brand">IPG</label>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="/">Home</a></li>
            <li><a href="/payment">Pay</a></li>
            <li><a href="/addMerchant">Add Merchant</a></li>
            <li><a href="/addCustomer">Add Customer</a></li>
        </ul>
    </div>
</nav>

<div class="container">
    <form action="#" method="post">
        <div><h3>Add Customer</h3></div>
        <div class="form-group">
            <label for="nationalCode">National Code:</label>
            <input type="text" class="form-control" id="nationalCode" name="nationalCode" placeholder="Enter national code">
        </div>
        <div class="form-group">
            <label for="firstName">First Name:</label>
            <input type="text" class="form-control" id="firstName" placeholder="Enter first name" name="firstName">
        </div>
        <div class="form-group">
            <label for="lastName">First Name:</label>
            <input type="text" class="form-control" id="lastName" placeholder="Enter last name" name="lastName">
        </div>

        <div class="form-group">
            <label for="cardNo">Card Number:</label>
            <input type="number" class="form-control" id="cardNo" placeholder="Enter card number" name="cardNo">
        </div>
        <div class="form-group">
            <label for="secondPass">Second Password:</label>
            <input type="password" class="form-control" id="secondPass" placeholder="Enter second pass" name="secondPass">
        </div>
        <div class="form-group">
            <label for="cvv2">CVV2:</label>
            <input type="number" class="form-control" id="cvv2" placeholder="Enter CVV2" name="cvv2">
        </div>

        <div class="form-group">
            <label>Expiration Date:</label>
            <div class="row" style="padding: 15px;">
                <input type="number" name="expirationDateMoth" class="col-sm-5" placeholder="Enter month">
                <input type="number" name="expirationDateYear" class="col-sm-5" style="margin-left: 15px;" placeholder="Enter year">
            </div>
        </div>

        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
        </div>
        <button type="submit" class="btn btn-info">Save User</button>
    </form>
    <%--<br>
    <div th:if="${error!=null}" class="alert alert-danger">
        <strong>Error!</strong><p th:text="${error}"></p>
    </div>
    <div th:if="${success!=null}" class="alert alert-success">
        <strong>Success!</strong><p th:text="${success}"></p>
    </div>--%>
</div>
</body>
</html>