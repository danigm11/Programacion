import java.util.Scanner;
import misFunciones.Varias;

public class Ejercicio14 {
  public static void main (String[] args) {
      int n1=0;
      String c="";
      Scanner s= new Scanner(System.in);

      System.out.print("Introduzca un caracter: ");
      c=s.next();
      System.out.print("Introduzca un numero de filas: ");
      n1=s.nextInt();
      Varias.piramide(n1,c);
  }
}