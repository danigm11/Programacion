import java.util.Scanner;

/*
 * Ej7.java
 * 
 * Daniel García Mesa 15/11/2022
 * 
 * Realiza un programa que calcule la media de 3 notas.
 * 
 * 
 */


public class Ej7 {
	
	public static void main (String[] args) {
		
		double nota1=0;
		double nota2=0;
		double nota3=0;
		double media=0;
		Scanner s= new Scanner(System.in);
		
		System.out.print("Introduzca la primera nota: ");
		nota1= s.nextDouble();
		System.out.print("Introduzca la segunda nota: ");
		nota2= s.nextDouble();
		System.out.print("Introduzca la tercera nota: ");
		nota3= s.nextDouble();
		
		media=((nota1+nota2+nota3)/3);
		
		System.out.print("La media de las 3 notas es: ");
		System.out.printf("%.2f",media);
	}
}

