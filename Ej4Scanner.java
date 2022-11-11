import java.util.Scanner;

/*
 * Ej4.java
 * Daniel García Mesa 11/11/2022
 * 
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 * 
 */


public class Ej4Scanner {
	
	public static void main (String[] args) {
		
		//declaración de variables
		
		double n1=0;
		double n2=0;
		Scanner s=new Scanner(System.in);
		
		//lee primer número
		
		System.out.print("Escriba un numero: ");
		
		
		n1=s.nextDouble();
		
		//lee segundo número
		
		System.out.print("Escriba otro numero: ");
		
		n2=s.nextDouble();
		
		//Calcula y muestra por pantalla el resultado de las operaciones
		
		System.out.println(n1+" + "+n2+" = "+(n1+n2));
		System.out.println(n1+" - "+n2+" = "+(n1-n2));
		System.out.println(n1+" * "+n2+" = "+(n1*n2));
		System.out.println(n1+" / "+n2+" = "+(n1/n2));
	}
}

