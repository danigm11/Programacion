import java.util.Scanner;

/*
 * Ej41.java
 * 
 * Daniel García Mesa 6/12/2022
 * 
 * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
 * hay dentro de un número. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 * 
 */


public class Ej41 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=0;
		int par=0;
		int impar=0;
		
			System.out.print("Introduzca un número positivo: ");
			n=s.nextInt();
			
			System.out.print(n+" tiene: ");
			
			while(n>0){
				if ((n%2)==0){
					par++;
				} else{
						impar++;
				}
				n=n/10;
			}
			
			System.out.print(par+" digitos pares y "+impar+" impares.");
			
		
	}
}

