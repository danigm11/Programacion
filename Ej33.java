import java.util.Scanner;

/*
 * Ej33.java
 * 
 * Daniel García Mesa 6/12/2022 
 * 
 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
 * programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
 * dos asteriscos menos en la base para simular la curvatura de las esquinas
 * inferiores.
 */


public class Ej33 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=0;
		do{
			System.out.print("Introduzca un número: ");
			n=s.nextInt();
		}while(n<=0);
		
		for(int i=1;i<n;i++){
			System.out.print("*");
			
			for(int j=0;j<(n);j++){
					System.out.print(" ");
				}
			System.out.println("*");
			if(i==n-1){
							System.out.print(" ");
			
			for(int j=0;j<((n/2)+1);j++){
					System.out.print("* ");
				}
			System.out.println(" ");

				
			}
		}
	}
}

