<%-- 
    Document   : form
    Created on : 15 may 2023, 16:29:47
    Author     : Dani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dam1.Personaje"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form</title>
    </head>
    <body>
        <hr>
<%
Personaje p1 = new Personaje("Batman", "imagenes/batman.png");
Personaje p2 = new Personaje("Spiderman", "imagenes/spiderman.jpg");
out.println(p1);
%>
        <form action="dialogo.jsp" method="post">
            <p>Escribe mi nombre: </p>
            <input type="text" name="name">
            
<%
out.println(p2);
%>          <p>Escribe mi nombre:</p>
            <input type="text" name="name2">
            <input type="submit" ></input>
        </form>
    </body>
</html>
