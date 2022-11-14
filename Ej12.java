import java.util.Scanner;

/*
 * Ej12.java
 * 
 * Daniel García Mesa 11/11/2022
 * 
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 * 
 * 
 */


public class Ej12 {
	
	public static void main (String[] args) {
		
		double nota1=0.0;
		double nota2=0.0;
		Scanner s= new Scanner(System.in);
		
		System.out.print("Introduzca su nota del primer examen: ");
		nota1=s.nextDouble();
		nota2=((5-(nota1*0.4))/0.6);
			
		System.out.printf("Para aprobar debe sacar al menos un "+" %.2f ",nota2);
		System.out.print(" en el segundo examen");

	}
}

