import java.util.Scanner;

/*
 * Ej11.java
 * 
 * Daniel García Mesa 3/12/2022
 * 
 * TEscribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * 
 * 
 */


public class Ej11 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=0;
		int c=0;
		int cc=0;
		
		do{
		System.out.print("Introduzca un número(positivo): ");
		n=s.nextInt();
		
		}while(n<0);
		
		for(int i=1;i<=5;i++){
			
			System.out.print((n+i)+"    al cuadrado: "+((n+i)*(n+i))+"   ");
			System.out.println(" al cubo: "+((n+i)*(n+i)*(n+i)));
		
		}
		
		
		
		
	}
}

