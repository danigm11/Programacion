/*
/*
 * Ej7.java
 * 
 *Daniel García Mesa 10/11/2022
 * 
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 * 
 * 
 */


public class Ej7 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		
		double baseImp=0;
		double total;
		String linea;
		
		//Lectura base imponible
		
		System.out.print("Escriba la base imponible: ");
		linea=System.console().readLine();
		baseImp=Double.parseDouble(linea);
		
		//Cálculo del total de la factura y salida por pantalla
		
		total=baseImp*1.21;
		System.out.print("Con la base "+baseImp+" euros, el total es: ");
		System.out.printf("%.2f euros",total);
		
		
	}
}

