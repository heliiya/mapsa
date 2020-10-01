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
    <title>Payment page</title>
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
      <div class="panel panel-primary" style="margin: 100px;">
        <div class="panel-heading text-center">payment info</div>
        <div class="panel-body">
          <form name="payment" method="post" action="ipg">
            <div class="form-group">
              <label for="merchantId">Merchant Id:</label>
              <input type="text" name="merchantId" id="merchantId" placeholder="Enter merchant id" class="form-control">
            </div>
            <div class="form-group">
              <label for="amount">Amount:</label>
              <input type="number" name="amount" id="amount" placeholder="Enter amount" class="form-control">
            </div>
            <button type="submit" class="btn btn-info">pay</button>
          </form>
        </div>
      </div>
    </div>
  </body>
</html>