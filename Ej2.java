/*
 * Ej2.java
 * 
 * Daniel García Mesa 16/12/2022
 * 
 * Ejemplo1 de numeros aleatorios 2
 * 
 * 
 */


public class Ej2 {
	
	public static void main (String[] args) {
		
		System.out.println("15 números aleatorios entre 0 y 10");
		System.out.println(" sin llegar a 10 (con decimales):");
		for (int i = 1; i <= 15; i++) {
			System.out.println( Math.random()*10 + " ");
		}
	}
}
