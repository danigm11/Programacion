<%-- 
    Document   : cuenta
    Created on : 22 may 2023, 17:25:56
    Author     : Dani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dam1.Comida"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                text-align: center;
            }
            table{
               margin-left: 6%;
               border: solid 1px;
            }
            td{
                border: solid 1px;
               text-align: center;
               width: 1.5%;
            }
        </style>
    </head>
    <body>
        <h1>Aquí tiene su pedido</h1>
        <%
          Comida[] comidas = new Comida[7];
          comidas[0]= new Comida("Pizza carpese",5.50,Integer.parseInt(request.getParameter("pizza")));
          comidas[1]= new Comida("Quinoa",6.95, Integer.parseInt(request.getParameter("quinoa")));
          comidas[2]= new Comida("Pasta al pesto",4.90, Integer.parseInt(request.getParameter("pesto")));
          comidas[3]= new Comida("Hamburguesa vegetariana",6.20, Integer.parseInt(request.getParameter("burguer")));
          comidas[4]= new Comida("Agua",1.00, Integer.parseInt(request.getParameter("agua")));
          comidas[5]= new Comida("Cerveza",1.50, Integer.parseInt(request.getParameter("cerveza")));
          comidas[6]= new Comida("Refresco",1.40, Integer.parseInt(request.getParameter("refresco")));
          out.print("<table><tr> <td><b>Comida / Bebida</b></td>  <td><b>PVP</b></td> <td><b>Cantidad</b></td><td><b>Subtotal</b></td></tr>");
          for(int i=0;i<comidas.length;i++){
            if(comidas[i].getCantidad()>0){
                out.print(Comida.escribirComida(comidas[i]));
            }
          }
         out.print("</table>");
         out.print("<h1>Total: "+Comida.getTotal()+"€</h1>");
         Comida.setTotal(0);
       %> 
    </body>
</html>
