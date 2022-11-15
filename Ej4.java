import java.util.Scanner;

/*
 * Ej4.java
 * 
 * Daniel García Mesa 15/11/2022
 * 
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
 * la hora.
 * 
 */	


public class Ej4 {
	
	public static void main (String[] args) {
		
		int horas=0;
		int horasExtra=0;
		int sueldo=0;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Introduzca las horas trabajadas: ");
		horas=s.nextInt();
		horasExtra=(horas-40);
		
		if(horas<=40){
			sueldo=horas*12;
		} else{
			sueldo=((40*12)+(horasExtra*16));
		} 
		


		if (sueldo<0){
			sueldo=0;
		}
		System.out.print("Tu sueldo corresponde a: "+sueldo);
	}
}
