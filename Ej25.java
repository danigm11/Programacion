import java.util.Scanner;

/*
 * Ej25.java
 * 
 * Daniel García Mesa 6/12/2022 * 
 * Realiza un programa que pida un número por teclado y que luego muestre ese
 * número al revés.
 * 
 */


public class Ej25 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=0;
		System.out.print("Introduzca un número: ");
		n=s.nextInt();
		
		System.out.print("El numero al reves es: ");
		while(n>0){
			System.out.print(n%10);
			n/=10;
		}
	}
}

