import java.util.Scanner;

/*
 * Ej15.java
 * 
 * Daniel García Mesa 3/12/2022
 * 
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación.
 * 
 * 
 */
 
public class Ej15 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		double base=0;
		int exp=0;
		double aux=0;
		
		System.out.print("Introduzca la base: ");
		base=s.nextDouble();
		System.out.print("Introduzca el exponente: ");
		exp=s.nextInt();
		
		aux=base;
		for(int i=0;i<exp;i++){
			base*=aux;
			System.out.println(aux+" elevado a "+(i+1)+" es: "+(base/aux));
		}
		
	}
}
