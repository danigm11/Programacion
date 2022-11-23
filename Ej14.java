import java.util.Scanner;

/*
 * Ej14.java
 * 
 * Daniel García Mesa 22/11/2022
 * 
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 * 
 */


public class Ej14 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		
		Scanner s;
		s=new Scanner(System.in);
		int n=0;
		
		//lectura de teclado
		
		System.out.print("Introduzca un número por teclado: ");
		n=s.nextInt();
		
		//selector opciones y salida por pantalla
		
		if((n%2==0)&&(n%5==0)){
			System.out.print("El numero indtroducido es par y divisible entre 5.");
			
		}	else if (n%2==0){
				System.out.print("El numero indtroducido es par, pero no divisible entre 5.");
		}	else if (n%5==0){
				System.out.print("El numero indtroducido es impar y divisible entre 5.");
		} else{
				System.out.print("El numero indtroducido no es par ni divisible entre 5.");
		}
	}
}

