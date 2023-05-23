<%-- 
    Document   : Juego
    Created on : 16 may 2023, 16:29:47
    Author     : Dani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dam1.Personaje"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Juego</title>
        <style type="text/css">
            body{
                background-color: slategray;
            }
            div{
                display: flex;
                text-align: center;
            }
            .partida{
                display: flex;
            }
        </style>
    </head>
    <body>
        <hr>
<%
Personaje p1 = new Personaje("Batman", "imagenes/batman.png");
Personaje p2 = new Personaje("Spiderman", "imagenes/spiderman.jpg");
%>
<%
while((p1.getPuntos()<5)&&(p2.getPuntos()<5)){
    out.println(p1.partida(p2));
    out.println("<div class=\"partida\"><br>Puntuación:&nbsp;"+p1+"<br>&nbsp;→&nbsp;"+p1.getPuntos()+p2+"<br>&nbsp;→&nbsp;"+p2.getPuntos()+"</div><hr>");
    
   }
%>
<%
if(p1.getPuntos()==5){
    out.print("<div><br>El ganador es:&nbsp;"+p1+"</div>");
    }else{
    out.print("<div><br>El ganador es:&nbsp;"+p2+"</div>");
    }
    
%>
    </body>
</html>
