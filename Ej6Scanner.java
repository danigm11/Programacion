import java.util.Scanner;

/*
 * Ej6Scanner.java
 * Daniel García Mesa 11/11/2022
 * 
 * Escribe un programa que calcule el área de un triángulo
 * 
 */


public class Ej6Scanner {
	
	public static void main (String[] args) {
		
		//declaración de variables
		
		double base=0;
		double altura=0;
		Scanner s=new Scanner(System.in);
		
		//lee la base
		
		System.out.print("Escriba la base: ");
		
		
		base=s.nextDouble();
		
		//lee la altura
		
		System.out.print("Escriba la altura: ");
		
		
		altura=s.nextDouble();
		
		//Calcula y muestra por pantalla el área del triángulo
		
		System.out.println("El área del triángulo es: "+(base*altura/2));
	}
}


