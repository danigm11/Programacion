import java.util.Scanner;

/*
 * Ej39.java
 * 
 * Daniel García Mesa 6/12/2022
 * 
 * Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los números desde el 1 al número introducido junto
 * con su factorial.
 * 
 * 
 */


public class Ej39 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=0;
		int fact=1;
		
		do{
			System.out.print("Introduzca un número positivo: ");
			n=s.nextInt();
		}while(n<=0);
		
		
		for(int i=1;i<=n;i++){
			fact=1;
			for(int j=1;j<=i;j++){
				fact*=j;
			}
			System.out.print((i+1)+"! = ");
			System.out.println(fact);
		}
	}
}

