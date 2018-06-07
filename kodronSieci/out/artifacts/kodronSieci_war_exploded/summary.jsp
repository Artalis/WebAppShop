<%@ page import="java.util.List" %>
<%@ page import="pl.javastart.model.Product" %><%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 24.05.2018
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Podsumowanie</title>
</head>
<body style="background-color:powderblue;">
<center>
    <ul>PODSUMOWANIE TWOICH ZAKUPÓW</ul>

<ul>Zakupione produkty:</ul>
<ul>
    <%
        List<Product> produkty = (List<Product>)request.getAttribute("produkty");
        Double cena =(Double) request.getAttribute("cena");
        Double srednia =(Double) request.getAttribute("srednia");
    %>
<table border="4"  style="background-color:darkblue;" width="400" >
    <tr style="color:white;" align="center">
        <th>#</th>
        <th>Nazwa</th>
        <th>Cena</th>

    </tr>
     <%
         for (Product produkt: produkty){
             %>
    <tr style="color:white;" align="center">
        <th>
            <%
               out.print(produkty.indexOf(produkt)+1);
            %>
        </th>

        <td>
        <%
            out.print(produkt.getName());
        %>
        </td>
        <td>
            <%
                out.print(produkt.getCena());
            %>
        </td>
    </tr>
    <%
         }
     %>
</table> <br>

Całkowity koszt: <%out.print(cena);%>  <br>
Średnia cena produktu: <%out.print(srednia);%>

</center>
</body>
</html>
