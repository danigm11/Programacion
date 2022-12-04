import java.util.Scanner;

/*
 * Ej18.java
 * 
 * Daniel García Mesa 4/12/2022
 * 
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 * 
 */


public class Ej18 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=0;
		int n2=0;
		
		System.out.print("Introduce un número: ");
		n=s.nextInt();
		do{
			System.out.print("Introduce el otro número: ");
			n2=s.nextInt();
			
		}while(n>=n2);
		
		for(int i=n;i<n2;i+=7){
			
			System.out.print(i+" ");
			
			
		}
		
		
		
	}
}

