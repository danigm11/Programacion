import java.util.Scanner;

/*
 * Ej27.java
 * 
 * Daniel García Mesa 6/12/2022 
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 * entre 1 y un número leído por teclado.
 * 
 */


public class Ej27 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=0;
		do{
			System.out.print("Introduzca un número: ");
			n=s.nextInt();
		}while(n<=0);
		System.out.print("Los múltiplos de 3 entre 1 y "+n+" son: ");
		for(int i=0;i<=n;i+=3){
			if(i!=0){
				System.out.print(i+" ");
			}
		}
	}
}
