import java.util.Scanner;

/*
 * Ej17.java
 * 
 * Daniel García Mesa 4/12/2022
 * 
 * Realiza un programa que sume los 100 números siguientes a un número entero
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 * 
 * 
 */


public class Ej17 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=0;
		int res=0;
		
		do{
			System.out.print("Introduce un número positivo: ");
			n=s.nextInt();
			
		}while(n<0);
		
		for(int i=1;i<=100;i++){
			res+=(i+n);
		}
		
		System.out.print("El resultado es: "+res);
		
	}
}

