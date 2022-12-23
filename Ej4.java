/*
 * Ej4.java
 * 
 * Daniel García Mesa 16/12/2022
 * 
 * Ejemplo1 de numeros aleatorios 4
 * 
 * 
 */


public class Ej4 {
	
	public static void main (String[] args) {
		System.out.println("15 números aleatorios entre 1 y 10 (sin decimales):");
		for (int i = 1; i <= 15; i++) {
			System.out.print( (int)(Math.random()*10 + 1) + " ");
		}
		System.out.println();
	}
}
		
	

