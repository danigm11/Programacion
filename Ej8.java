import java.util.Scanner;

/*
 * Ej8.java
 * 
 * Daniel García Mesa 29/11/2022
 * 
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 */


public class Ej8 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int num=0;
		System.out.print("Introduzca un número para ver su tabla	: ");
		num=s.nextInt();
		
		for(int i=1;i<=10;i++){
			
			System.out.println("  "+num+" x "+i+" = "+(num*i));
		}
	}
}
