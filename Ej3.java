/*
 * Ej3.java
 * 
 * Daniel García Mesa 16/12/2022
 * 
 * Ejemplo1 de numeros aleatorios 3
 * 
 * 
 */


public class Ej3 {
	
	public static void main (String[] args) {
		
		System.out.println("15 números aleatorios entre 0 y 9 (sin decimales):");
		for (int i = 1; i <= 15; i++) {
			System.out.print((int)(Math.random()*10) + " ");
		}
		System.out.println();
	}
}

