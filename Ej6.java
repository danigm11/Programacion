/*
 * Ej6.java
 * 
 *Daniel García Mesa 7/11/2022
 * 
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estará almacenada en una
 * variable.
 * 
 * 
 */


public class Ej6 {
	
	public static void main (String[] args) {
		
		double baseImp=5;
		double total=0;
		total=baseImp*1.21;
		
		System.out.println("Con la base "+(int)baseImp+" euros, el total es: "+(int)total+" euros");
	}
}

