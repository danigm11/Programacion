import java.util.Scanner;

/**
 * 
 * @author Daniel García Mesa
 * @since 14.04.2023
 * 
 *        Realiza un programa que pida 6 números por teclado y nos diga cuál es
 *        el
 *        máximo. Si el usuario introduce un dato erróneo (algo que no sea un
 *        número
 *        entero) el programa debe indicarlo y debe pedir de nuevo el número.
 */

public class Ej1 {
  public static void main(String[] args) {
    //Este booleano se utiliza para el bucle que controla si el número introducido es correcto
    boolean aux = false;
    int tam = 6;
    int max = 0;
    int[] array = new int[tam];
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca 6 números: ");
    for (int i = 0; i < tam; i++) {
       do{
        try {
          System.out.print("Introduzca el " + (i + 1) + "º número: ");
          array[i] = s.nextInt();
          aux=false;
        } catch (Exception e) {
          System.out.println("Entrada equivocada");
          aux=true;
          //Esta línea limpia el contenido del Scanner para evitar un bucle infinito
          s.next();
        }
      }while (aux == true);
    }
    for (int i = 0; i < tam; i++) {
      if (i == 0) {
        max = array[i];
      } else {
        if (max < array[i]) {
          max = array[i];
        }
      }
    }
    System.out.println("El máximo es " + max);
  }
}
