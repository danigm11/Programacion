/*
 * Ej4.java
 * 
 * Daniel García Mesa 29/11/2022
 * 
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
 * un bucle for.
 * 
 */


public class Ej4 {
	
	public static void main (String[] args) {
		
		System.out.print("Los números del 320 al 160, contando de 20 en 20 hacia atrás son: ");
		
		for(int i=320;i>159;i-=20){
			
			System.out.print(i+" ");
		}
	}
}
