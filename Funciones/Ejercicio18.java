import misFunciones.Varias;
import java.util.Scanner;
/*
 * Daniel García Mesa 9/02/2023
 * 
 * Ejercicio18.java
 * 
 * Escribe un programa que pida el DNI y muestre por pantalla la letra asociada. Para ello se
 * deberá crear una función a la que se le pase el número y devuelva la letra.
 * 
 */
public class Ejercicio18 {
  public static void main(String[]args){
    long dni=0;
    Scanner s=new Scanner(System.in);

    System.out.print("Introduzca los numeros de un DNI: ");
    dni=s.nextLong();
   
    System.out.print("Para el DNI: "+dni+" la letra es: "+Varias.letraDNI(dni));
  }
}
