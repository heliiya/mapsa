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
                <div><h3>Add Merchant</h3></div>
                <div class="form-group">
                    <label for="id">Id:</label>
                    <input type="text" class="form-control" id="id" placeholder="Enter id" name="id">
                </div>
                <div class="form-group">
                    <label for="name">Name:</label>
                    <input type="text" class="form-control" id="name" placeholder="Enter name" name="name">
                </div>
                <button type="submit" class="btn btn-info">Save Merchant</button>
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