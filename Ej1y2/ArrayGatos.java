package Ej1y2;
import java.util.Scanner;
import Ej1y2.Gato.Gato;

/*
 * Daniel García Mesa 16/03/2023
 * 
 * Ejercicios 1 y 2 de arrays de objetos
 * 
 * Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos
 * de cada uno de ellos mediante un bucle. Muestra a continuación los datos de
 * todos los gatos utilizando también un bucle.
 * 
 * 
 */

public class ArrayGatos{
  public static void main(String[] args) {
  Gato[] arrayGatos= new Gato[4];
  Scanner s =new Scanner(System.in);

  //Bucle que pide los datos de los gatos
    for(int i=0;i<4;i++){
      arrayGatos[i] = new Gato();
      System.out.print("\nIntroduzca el nombre del "+(i+1)+"º   gato: ");
      arrayGatos[i].setNombre(s.next());
      System.out.print("Introduzca el color del "+(i+1)+"º   gato: ");
      arrayGatos[i].setColor(s.next());
      System.out.print("Introduzca la raza del "+(i+1)+"º   gato: ");
      arrayGatos[i].setRaza(s.next());
      System.out.print("Introduzca las sardinas que come el "+(i+1)+"º   gato: ");
      arrayGatos[i].come( s.nextInt());
    }

  //Bucle que muestra por pantalla los datos de los gatos
    for(int i=0;i<4;i++){
      System.out.print("\nLos datos del gato"+(i+1)+" son: ");
      System.out.print("Nombre: "+arrayGatos[i].getNombre());
      System.out.print(", Color: "+arrayGatos[i].getColor());
      System.out.print(", Raza: "+arrayGatos[i].getRaza());
      
    }
  }
}