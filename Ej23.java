import java.util.Scanner;

/*
 * Ej23.java
 * 
 * Daniel García Mesa 25/11/2022
 * 
 * Escribe un programa que calcule el precio final de un producto según su
 * base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 * reducido o superreducido) y el código promocional. Los tipos de IVA general,
 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
 * promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
 * muestran los valores correctos, aunque los números no estén tabulados.
 * 
 */


public class Ej23 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		
		Scanner s=new Scanner(System.in);
		double base=0;
		double total=0;
		double reduc=0;
		double desc=0;
		String iva="";
		String cod="";
		
		//lectura de datos por pantalla
		
		System.out.print("Introduzca la base imponible: ");
		base=s.nextDouble();
		System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
		iva=s.next();
		System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
		cod=s.next();
		
		//Cálculos
		
		if(iva.equalsIgnoreCase("general")){
			reduc=0.21;
			
		}	else if(iva.equalsIgnoreCase("reducido")){
				reduc=0.10;
		}	else if(iva.equalsIgnoreCase("superreducido")){
				reduc=0.04;
		}
		
		if(cod.equalsIgnoreCase("nopro")){
			desc=0;
		}	else if(cod.equalsIgnoreCase("mitad")){
				desc=((base+(base*reduc))/2);
		}	else if(cod.equalsIgnoreCase("meno5")){
				desc=5;
		}	else if(cod.equalsIgnoreCase("5porc")){
				desc=((base+(base*reduc))*0.05);
		}
		
		total=((base+(base*reduc))-desc);
		
		//salida por pantalla
		
		System.out.printf("Base imponible: %.2f",base);
		System.out.println("\nIVA: "+(base*reduc));
		System.out.println("Precio con IVA: "+(base+(base*reduc)));
		System.out.println("Descuento: "+desc);
		System.out.printf("Precio final: %.2f",total);

		
	}	
}

