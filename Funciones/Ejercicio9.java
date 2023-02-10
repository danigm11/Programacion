import java.util.Scanner;
import misFunciones.Varias;

public class Ejercicio9 {
    public static void main (String[] args) {
        int n1=0;
        int n2=0;
        Scanner s= new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        n1=s.nextInt();
        System.out.print("Introduzca otro numero: ");
        n2=s.nextInt();
        System.out.print("El mayor es: "+Varias.maximo(n1,n2));
    }
}
