import java.util.Scanner;

/*
 * Ej3.java
 * 
 * Daniel García Mesa 09/01/2023
 * 
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en mostrarse
 * y viceversa.
 * 
 * 
 */


public class Ej3 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int[] num= new int[10];
		
		System.out.println("Introduzca 10 numeros por teclado ");
		for(int i=0;i<10;i++){
			if(i==0){
				System.out.print("Introduzca el primer numero: ");
			}	else{
					System.out.print("Introduzca el siguiente numero: ");
			}
			num[i]=s.nextInt();
			
		}
		for(int i=9;i>=0;i--){
			
			System.out.print(num[i]+" ");
			
		}
		
		
	}
}

