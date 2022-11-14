import java.util.Scanner;

/*
 * Ej8.java
 * 
 * Daniel García Mesa 11/11/2022
 * 
 * Escribe un programa que calcule el salario semanal de un empleado en base a
 * las horas trabajadas, a razón de 12 euros la hora.
 * 
 */


public class Ej8 {
	
	public static void main (String[] args) {
		
		Scanner s= new Scanner(System.in);
		Double horas;
		Double sueldo;
		System.out.print("Introduzca el número de horas trabajadas: ");
		horas=s.nextDouble();
		sueldo=12*horas;
		
		System.out.print("El sueldo total es: "+sueldo+" euros");
	}
}

