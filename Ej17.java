import java.util.Scanner;

/*
 * Ej17.java
 * 
 * Daniel García Mesa 23/11/2022
 * 
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 * 
 */


public class Ej17 {
	
	public static void main (String[] args) {
		
		//declaración de variables
		
		Scanner s=new Scanner(System.in);
		int n=0;
		int x=0;
		//lectura de datos por teclado
		
		System.out.print("Introduce un número entero: ");
		n=s.nextInt();
		
		//cálculo cifra
		
		x=n%10;
		
		//Salida por pantalla
		
		System.out.print("La última cifra del número es: "+x); 
		
		
	}
}

