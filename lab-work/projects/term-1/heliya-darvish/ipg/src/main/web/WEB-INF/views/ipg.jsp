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
    <title>ipg page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
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

    <div class="container container-fluid">
        <div class="text-center"><h2>MAPSA IPG</h2></div>

        <div class="panel panel-primary">
            <div class="panel-heading text-center">payment info</div>
            <div class="panel-body">
                <div>
                    <span>Amount:</span>
                    <span>${amount}</span>
                    <span>Rial</span>
                </div>
                <div>
                    <span>Merchant Name:</span>
                    <span>${merchantId}</span>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-sm-6" >
                <div class="panel panel-primary">
                    <div class="panel-heading text-center">Card info</div>
                    <div class="panel-body">

                        <form name="cartInfo" action="pay" method="POST" >
                            <div class="form-group">
                                <label for="cardNo">Card Number:</label>
                                <input type="number" class="form-control" id="cardNo" placeholder="Enter card no" name="cardNo">
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
                                    <input type="number" name="expirationDateMoth" class="col-sm-5" placeholder="month">
                                    <input type="number" name="expirationDateYear" class="col-sm-5" style="margin-left: 15px;" placeholder="year">
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="email">Email (optional):</label>
                                <input type="email" class="form-control" id="email" name="email" placeholder="Enter email">
                            </div>

                            <button type="submit" class="btn btn-info">pay</button>
                            <button type="reset" class="btn btn-danger">cancel</button>
                        </form>

                    </div>
                </div>
            </div>

            <div class="col-sm-6" >
                <div class="panel panel-primary">
                    <div class="panel-heading text-center">IPG Help</div>
                    <div class="panel-body">
                        Help doc
                    </div>
                </div>
            </div>

        </div>
    </div>
</body>
</html>
