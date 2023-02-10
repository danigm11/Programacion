import misFunciones.Varias;
import java.util.Scanner;
/*
 * Funciones20a28.java
 * 
 * Daniel García Mesa 31/01/2023
 * 
 * Crea una biblioteca de funciones para arrays (de una dimensión) de números
 * enteros que contenga las siguientes funciones:
 * 
 * 
 */


public class Ejercicio1 {
	
	public static void main (String[] args) {
		double n1=0;
		double n2=0;
		Scanner s= new Scanner(System.in);

		System.out.print("Introduzca un numero: ");
		n1=s.nextDouble();
		System.out.print("Introduzca otro numero: ");
		n2=s.nextDouble();
		
		System.out.print(Varias.multiplica(n1,n2));
		
	}
}
