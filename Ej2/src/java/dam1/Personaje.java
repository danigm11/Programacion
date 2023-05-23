/* Personaje.java () */
package dam1;
import java.util.ArrayList;
public class Personaje {
private String nombre;
private String imagen;
private int puntos =0;
public Personaje (String nombre, String imagen) {
this.nombre = nombre;
this.imagen = imagen;
}
public int getPuntos() {
return puntos;
}
public void setPuntos(int puntos){
    this.puntos=puntos;
}
public String getNombre() {
return nombre;
}
public String getImagen() {
return imagen;
}
@Override
public String toString() {
    return "<div class=\"accion\"><img src=\"" + imagen + "\" width=\"80\"></div>";
}
public String juega(){
    String jugada ="";
    int elecc =((int)(Math.random()*3));
    if(elecc==0){
        jugada="piedra";
    }else if(elecc==1){
        jugada="papel";
    }else if(elecc==2){
        jugada="tijeras";
    }
    return jugada;
}
public String partida( Personaje p2){
    String res= "";
    String jugada1 = this.juega();
    String jugada2 = p2.juega();
    if ((jugada1.equals("piedra"))&&(jugada2.equals("papel"))||(jugada1.equals("papel"))&&(jugada2.equals("tijeras"))||(jugada1.equals("tijeras"))&&(jugada2.equals("piedra"))){
        p2.setPuntos(p2.getPuntos()+1);
        res=(this+"<br><br>&nbsp;juega&nbsp;"+"<div ><img src=\"imagenes/" + jugada1+".jpg"+ "\" width=\"80\"></div><br>"+" "+p2+"<br><br>&nbsp;juega&nbsp;"+"<div ><img src=\"imagenes/" + jugada2+".jpg"+ "\" width=\"80\"></div>"+"<br><br>"+" Resultado: gana jugador 2<hr>");
    }else if(jugada1.equals(jugada2)){
        res=(this+"<br><br>&nbsp;juega&nbsp;"+"<div ><img src=\"imagenes/" + jugada1+".jpg"+ "\" width=\"80\"></div><br>"+" "+p2+"<br><br>&nbsp;juega&nbsp;"+"<div ><img src=\"imagenes/" + jugada2+".jpg"+ "\" width=\"80\"></div>"+"<br><br>"+" Resultado: empate<hr>");
    }else{
        this.setPuntos(this.getPuntos()+1);
        res=(this+"<br><br>&nbsp;juega&nbsp;"+"<div ><img src=\"imagenes/" + jugada1+".jpg"+ "\" width=\"80\"></div><br>"+" "+p2+"<br>&nbsp;juega&nbsp;"+"<div ><img src=\"imagenes/" + jugada2+".jpg"+ "\" width=\"80\"></div><br><br>Resultado: gana jugador 1<hr>");
    }
    res="<div class=\"partida\">"+res+"</div><hr>";
    return res;
}
}