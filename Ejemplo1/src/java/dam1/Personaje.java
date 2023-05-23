/* Personaje.java () */
package dam1;
import java.util.ArrayList;
public class Personaje {
private String nombre;
private String imagen;
public Personaje (String nombre, String imagen) {
this.nombre = nombre;
this.imagen = imagen;
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

public String presentacion() {
    return "<div class=\"circle_box\">&nbsp;Hola buenas, soy "+nombre+"&nbsp;<div class=\"accion\"><img src=\"" + imagen + "\" width=\"80\"></div></div>";
}
public String presentacion2() {
    return "<div class=\"circle_box_left\">&nbsp;Yo soy "+nombre+"&nbsp;<div class=\"accion\"><img src=\"" + imagen + "\" width=\"80\"></div></div>";
}

public String come(String comida) {
    return "<div class=\"accion\"><img src=\"" + imagen + "\" width=\"80\"><div class=\"square_box\">&nbsp;Estoy comiendo " + comida + "&nbsp;</div></div>";
}

public String habla(){
    String frase="";
    ArrayList<String> frases= new ArrayList<>();
    frases.add("Soy la sombra que acecha la oscuridad");
    frases.add("La justicia no espera a la luz del día");
    frases.add("Soy el protector de Gotham, la pesadilla de los criminales");
    frases.add("La noche es oscura y está llena de terrores, pero yo soy la sombra que los acecha.");
    frases.add("No busco la gloria ni el reconocimiento, solo la tranquilidad de saber que hice lo correcto.");
    frases.add("La noche es mi aliada, el escenario perfecto para impartir mi propia forma de justicia");
    frase=frases.get((int)(Math.random()*6));
    return "<div class=\"circle_box_left\">&nbsp;"+frase+"&nbsp;<div class=\"accion\"><img src=\"" + imagen + "\" width=\"80\"></div></div>";
}
public String habla2(){
    String frase="";
    ArrayList<String> frases= new ArrayList<>();
    frases.add("Un gran poder conlleva una gran responsabilidad");
    frases.add("Con cada caída, me levanto más fuerte.");
    frases.add("Con cada villano al que me enfrento, sé que el bien siempre prevalecerá.");
    frases.add("Mi sentido arácnido nunca me ha fallado");
    frases.add("La verdadera fuerza no radica en vencer a los demás, sino en ser capaz de controlar tus propios poderes.");
    frases.add("Ser un héroe no significa nunca tener miedo, significa enfrentar el miedo y superarlo.");
    frase=frases.get((int)(Math.random()*6));
    return "<div class=\"circle_box\">&nbsp;"+frase+"&nbsp;<div class=\"accion\"><img src=\"" + imagen + "\" width=\"80\"></div></div>";
}
}
