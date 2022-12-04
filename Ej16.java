import java.util.Scanner;

/*
 * Ej16.java
 * 
 * Daniel García Mesa 3/12/2022
 * 
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad
 * 
 * 
 */


public class Ej16 {
	
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=0;
		boolean primo=false;
		
		System.out.print("Introduce un número para comprobar si es primo: ");
		n=s.nextInt();
		
		if((n%2)!=0){
			
			primo=true;
			for(int i=3;i<(n/2);i+=2){
				
			if((n%i)==0){
				primo=false;
				i=n;
			}
			
			}
		}
		
		if(primo){
			System.out.print("El número es primo");
		}	else{
				System.out.print("El número no es primo");
		}
		
	}
}

