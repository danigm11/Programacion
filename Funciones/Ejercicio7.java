import misFunciones.Geometria;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main (String[] args) {
        int n1=0;
        int n2=0;
        Scanner s= new Scanner(System.in);

        System.out.print("Introduzca la altura: ");
        n1=s.nextInt();
        System.out.print("Introduzca la base: ");
        n2=s.nextInt();
        System.out.println("El area del rectangulo es: "+Geometria.areaRectangulo(n1,n2));
        System.out.println("El perimetro del rectangulo es: "+Geometria.perimetroRectangulo(n1,n2));
    }
}