import java.util.Scanner;

/*
 * Ej23.java
 * 
 * Daniel García Mesa 6/12/2022
 * 
 * Escribe un programa que permita ir introduciendo una serie indeterminada
 * de números mientras su suma no supere el valor 10000. Cuando esto último
 * ocurra, se debe mostrar el total acumulado, el contador de los números
 * introducidos y la media.
 * 
 */


public class Ej23 {
	
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=0;
		int cont=0;
		int suma=0;
		do{
			System.out.print("Introduzca un número: ");
			n=s.nextInt();
			cont++;
			suma+=n;

			
		}while(suma<1000);
		
		System.out.println("Se han introducido "+(cont)+" numeros");
		System.out.println("Su suma es: "+suma);
		System.out.println("La media es: "+(suma/cont));
	}
}

