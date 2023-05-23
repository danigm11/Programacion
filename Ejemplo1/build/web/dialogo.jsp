<%-- index.jsp () --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dam1.Personaje"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Personajes con clase</title>  
</head>
<style>
    body{
        background-color: black;
        max-width: 60%;
        margin-left: 20%;
    }
    root { 
  display: block;
}

.accion {
  display: block;
  position: relative;
  padding-top: 80px;
}

img {
  float: left;
}

.arrow_box {
  float: left;
  position: relative;
  background: #88b7d5;
  border: 4px solid #c2e1f5;
  border-radius: 20px;
  font-size: 36px;
  color: white;
  text-shadow: 0px 1px 0px #999, 0px 2px 0px #888, 0px 3px 0px #777, 0px 4px 0px #666, 0px 5px 0px #555, 0px 6px 0px #444, 0px 7px 0px #333, 0px 8px 7px #001135;
}
.circle_box {
  float: right;
  margin-bottom: 5%;
  background: #123a;
  border: 4px solid #ff0000;
  border-radius: 20px;
  font-size: 36px;
  color: white;
  max-width: 50%;
}
.circle_box_left {
  display: flex;
  float: left;
  margin-bottom: 5%;
  background: #123a;
  border: 4px solid #c2e1f5;
  border-radius: 20px;
  font-size: 36px;
  color: white;
  max-width: 50%;
}
.square_box {
  float: left;
  position: relative;
  background: #345;
  border: 4px solid #ff0000;
  font-size: 36px;
  color: white;
  text-shadow: 0px 1px 0px #999, 0px 2px 0px #888, 0px 3px 0px #777, 0px 4px 0px #666, 0px 5px 0px #555, 0px 6px 0px #444, 0px 7px 0px #333, 0px 8px 7px #001135;
}
.arrow_box:after, .arrow_box:before {
  right: 100%;
  border: solid transparent;
  content: " ";
  height: 0;
  width: 0;
  position: absolute;
  pointer-events: none;
}

.arrow_box:after {
  border-color: rgba(136, 183, 213, 0);
  border-right-color: #88b7d5;
  border-width: 10px;
  top: 50%;
  margin-top: -10px;
}
.arrow_box:before {
  border-color: rgba(194, 225, 245, 0);
  border-right-color: #c2e1f5;
  border-width: 16px;
  top: 50%;
  margin-top: -16px;
}
</style>
<body>
<h1>Personajes con clase</h1>
<hr>
<%
Personaje p1 = new Personaje(request.getParameter("name"), "imagenes/batman.png");
Personaje p2 = new Personaje(request.getParameter("name2"), "imagenes/spiderman.jpg");
Personaje p3 = new Personaje("Hulk", "imagenes/hulk.jpg");
%>
<div>
   <%out.println(p1.presentacion2());
    out.println(p2.presentacion()); %>
</div>
<div>
   <% out.println(p1.habla());
out.println(p2.habla2());
out.println(p1.habla());
out.println(p2.habla2()); %>
</div>
</body>
</html>