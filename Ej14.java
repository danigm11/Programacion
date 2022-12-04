import java.util.Scanner;

/*
 * Ej14.java
 * 
 * Daniel García Mesa 3/12/2022
 * 
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
 * calcule la potencia.
 */


public class Ej14 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int base=0;
		int exp=0;
		int aux=0;
		
		System.out.print("Introduzca la base: ");
		base=s.nextInt();
		System.out.print("Introduzca la base: ");
		exp=s.nextInt();
		
		aux=base;
		for(int i=1;i<exp;i++){
			base*=aux;
		}
		
		System.out.print("El resultado es: "+base);
		
	}
}

