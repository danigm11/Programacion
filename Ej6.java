/*
 * Ej6.java
 * Daniel García Mesa 10/11/2022
 * 
 * Escribe un programa que calcule el área de un triángulo
 * 
 */


public class Ej6 {
	
	public static void main (String[] args) {
		
		//declaración de variables
		
		double base=0;
		double altura=0;
		String linea;
		
		//lee la base
		
		System.out.print("Escriba la base: ");
		
		linea=System.console().readLine();
		
		base=Double.parseDouble(linea);
		
		//lee la altura
		
		System.out.print("Escriba la altura: ");
		
		linea=System.console().readLine();
		
		altura=Double.parseDouble(linea);
		
		//Calcula y muestra por pantalla el área del triángulo
		
		System.out.println("El área del rectángulo es: "+(base*altura/2));
	}
}


