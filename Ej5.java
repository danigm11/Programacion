/*
 * Ej5.java
 * 
 * Daniel García Mesa 16/12/2022
 * 
 * Ejemplo1 de numeros aleatorios 5
 * 
 * 
 */



public class Ej5 {
	
	public static void main (String[] args) {
		System.out.println("15 números aleatorios entre 50 y 60 (sin decimales):");
		for (int i = 1; i <= 15; i++) {
			System.out.print(((int)(Math.random()*11) + 50 ) + " ");
		}
		System.out.println();
	}
}
