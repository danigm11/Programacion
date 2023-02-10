import misFunciones.Varias;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String[] args) {
        int n1=0;
        int n2=0;
        Scanner s= new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        n1=s.nextInt();
        System.out.print("Introduzca un numero: ");
        n2=s.nextInt();
        System.out.print("El menor es: "+Varias.minimo(n1,n2));
    }
}
