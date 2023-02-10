import misFunciones.Varias;
import java.util.Scanner;
/*
 * Daniel García Mesa 9/02/2023
 * 
 * Ejercicio17.java
 * 
 *  Realiza un programa que nos pida número enteros hasta que se introduzca el 0, diciéndonos,
 * para cada número introducido si es primo o no. Hay que recordar que un número es primo si es
 * divisible por sí mismo y por 1. El 1 no es primo por convenio. Se debe crear una función que
 * pasándole un número entero devuelva si es primo o no
 * 
 */
public class Ejercicio17 {
  public static void main(String[]args){
    int n=0;
    Scanner s=new Scanner(System.in);
    do{
      System.out.print("Escriba un numero: ");
      n=s.nextInt();
      if(Varias.esPrimo(n)){
        System.out.println(n+" es primo.");
      } else{
        System.out.println(n+" NO es primo.");
      }
    }while(n!=0);
    System.out.println("FIN");
  }
}