<%--
  Created by IntelliJ IDEA.
  User: heliii
  Date: 8/3/2020
  Time: 9:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Home</title>
</head>
<body>
<form name="loginForm" method="post" action="login">
  <div>
    <label for="loginUsername">user name:</label>
    <input type="text" name="username" id="loginUsername"/>
  </div>
  <br>
  <div>
    <label for="loginPassword">password:</label>
    <input type="password" name="password" id="loginPassword"/>
  </div>
  <br>
  <input type="submit" value="login"/>
</form>

<form name="registerForm" method="post" action="register">
  <div>
    <label for="registerUsername">user name:</label>
    <input type="text" name="username" id="registerUsername"/>
  </div>
  <br>
  <div>
    <label for="registerPassword">password:</label>
    <input type="password" name="password" id="registerPassword"/>
  </div>
  <br>
  <input type="submit" value="register"/>
</form>
</body>
</html>