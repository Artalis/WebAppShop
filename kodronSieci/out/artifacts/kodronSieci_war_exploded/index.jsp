<%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 24.05.2018
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>SKLEP DLA CIEBIE</title>
  </head>
  <body style="background-color:powderblue;">

  <center> <ul><font size="6">SKLEP ZE WSZYSTKIM</font></ul>


<ul><font size="2">Wpisz nazwy i ceny produktów, które chcesz kupić:</font></ul>

  <form method="post" action="/sklep">
    <input type="text" name="firstName" placeholder="Product1"><input type="text" name="firstPrice" placeholder="Price1"><br>
    <input type="text" name="secondName" placeholder="Product2"><input type="text" name="secondPrice" placeholder="Price1"><br>
    <input type="text" name="thirdName" placeholder="Product3"><input type="text" name="thirdPrice" placeholder="Price1"><br>
    <input type="text" name="fourthName" placeholder="Product4"><input type="text" name="fourthPrice" placeholder="Price1"><br>
    <input type="submit" value="Kup Teraz">
  </form></center>
  </body>
</html>
