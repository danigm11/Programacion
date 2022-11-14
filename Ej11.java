import java.util.Scanner;

/*
 * Ej11.java
 * 
 * Daniel García Mesa 11/11/2022
 * 
 * Realiza un conversor de kb a Mb.
 * 
 * 
 */


public class Ej11 {
	
	public static void main (String[] args) {
	
	Scanner s=new Scanner(System.in);
	double mb=0.00;
	double kb=0.00;
	
	System.out.print("Escriba el número de kb: ");
	kb=s.nextDouble();
	mb=kb/1024;
	
	System.out.println("El resultado en mb es: "+mb);
	
		
	}
}

