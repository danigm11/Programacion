import java.util.Scanner;

/*
 * Ej10.java
 * 
 * Daniel García Mesa 11/11/2022
 * 
 * Realiza un conversor de Mb a Kb.
 * 
 * 
 */


public class Ej10 {
	
	public static void main (String[] args) {
	
	Scanner s=new Scanner(System.in);
	double mb=0.00;
	double kb=0.00;
	
	System.out.print("Escriba el número de mb: ");
	mb=s.nextDouble();
	kb=mb*1024;
	
	System.out.println("El resultado en kb es: "+kb);
	
		
	}
}

