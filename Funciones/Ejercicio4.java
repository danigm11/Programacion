import misFunciones.Varias;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String[] args) {
        int n1=0;
        Scanner s= new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        n1=s.nextInt();
        System.out.print("El signo es: "+Varias.dimeSigno(n1));
    }
}
