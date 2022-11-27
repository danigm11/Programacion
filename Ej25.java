import java.util.Scanner;

/*
 * Ej25.java
 * 
 * Daniel García Mesa 25/11/2022
 * 
 * La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
 * máxima calidad y nos ha pedido hacer un configurador que calcule el precio
 * según el alto y el ancho. El precio base de una bandera es de un céntimo de
 * euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
 * se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
 * son 3.25 €. El IVA ya está incluido en todas las tarifas
 * 
 */


public class Ej25 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		
		Scanner s=new Scanner(System.in);
		double alto=0;
		double ancho=0;
		double bord=0;
		double total=0;
		String bordado="";
		
		//lectura de datos por pantalla
		
		System.out.print("Introduzca el alto(en cm): ");
		alto=s.nextDouble();
		System.out.print("Introduzca el ancho(en cm): ");
		ancho=s.nextDouble();
		System.out.print("Introduzca si quiere el escudo bordado(si o no): ");
		bordado=s.next();
		
		//Cálculos
		
		if(bordado.equalsIgnoreCase("si")){
			bord=2.50;
			
		}	
		
		total+=(3.25+bord+(alto*ancho/10000));
		
		//salida por pantalla
		
		System.out.printf("Base precio: %.2f",total);
		System.out.print(" euros.");

		
	}	
}

