import misFunciones.Varias;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String[] args) {
        int n1=0;
        Scanner s= new Scanner(System.in);

        System.out.print("Introduzca N: ");
        n1=s.nextInt();
        
        System.out.println("La suma de 1 a N es: "+Varias.suma1aN(n1));
        System.out.println("La multiplicacion de 1 a N es: "+Varias.factorial1aN(n1));
        System.out.println("El intermedio entre 1 y N es: "+Varias.intermedio1aN(n1));
    }
}