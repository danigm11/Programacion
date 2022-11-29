/*
 * Ej6.java
 * 
 * Daniel García Mesa 29/11/2022
 * 
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
 * un bucle while.
 * 
 */


public class Ej6 {
	
	public static void main (String[] args) {
		
		int i=320;
		System.out.print("Los números del 320 al 160, contando de 20 en 20 hacia atrás son: ");
		
		do{
			
			System.out.print(i+" ");
			i-=20;
		}while(i>159);
	}
}
