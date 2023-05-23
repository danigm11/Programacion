<%-- 
    Document   : index
    Created on : 22 may 2023, 17:26:11
    Author     : Dani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                text-align: center;
            }
            .pedido{
                height: 50px;
                width: 150px;
            }
            .table1{
                margin-left: 12.5%; 
                border: solid 2px;
                padding: 5px;
                width: 75%;  
            }
            .table2{
                margin-left: 12.5%; 
                padding: 5px;
                width: 75%;  
            }
            .table3{
                margin-left: 4%; 
                padding: 5px;
                width: 75%;  
            }
            td{
                width: 14%;
                border: solid 2px;
                padding: 5px; 
            }
            .tde{
                border: 0;
            }
        </style>
    </head>
    <body>
        <table class="table1">
            <tr>
                <td>Quinoa con Verdura</td> 
                <td>Pizza Carpense</td> 
                <td>Pasta al pesto</td>
                <td>Hamburguesa Vegetariana</td> 
                <td>Cerveza</td> 
                <td>Agua</td> 
                <td>Refresco</td> 
            </tr>
            <tr>
                <td><div><img src=imagenes/quinoa.jpg width="80"></div></td> 
                <td><div><img src=imagenes/pizza.jpg width="80"></div></td> 
                <td><div><img src=imagenes/pesto.jpg width="80"></div></td> 
                <td><div><img src=imagenes/burguer.jpg width="80"></div></td> 
                <td><div><img src=imagenes/cerveza.jpg height="80" width="80"></div></td> 
                <td><div><img src=imagenes/agua.jpg height="80" width="80"></div></td> 
                <td><div><img src=imagenes/refresco.jpg width="80"></div></td> 
            </tr>
        </table>
        <form action="cuenta.jsp" method="post">
        <h2>Seleccione la cantidad que desea de cada prodcuto</h2>
        <table class="table2"><tr>
        <td><img src=imagenes/quinoa.jpg width="80"><br>
        <input  name="quinoa" value="0" type="number"></td>
        <td><img src=imagenes/pesto.jpg width="80"><br>
        <input value="0" name="pesto" type="number"></td>
        <td><img src=imagenes/pizza.jpg width="80"><br>
        <input value="0" name="pizza" type="number"></td>
        <td><img src=imagenes/burguer.jpg width="80"><br>
        <input value="0" name="burguer" type="number"></td>
            </<tr></table><table class="table3"><tr>
            <td class="tde"></td>
            <td><img src=imagenes/agua.jpg width="80" height="80"><br>
            <input value="0" name="agua" type="number"></td>
            <td><img src=imagenes/cerveza.jpg width="80"><br>
            <input value="0" name="cerveza" type="number"></td>
            <td><img src=imagenes/refresco.jpg width="80"><br>
            <input value="0" name="refresco" type="number"></td>
            </tr>
        </table>
        <input type="submit" value="Hacer pedido" class="pedido">
        </form>
    </body>
</html>
