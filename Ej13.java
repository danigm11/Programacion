import java.util.Scanner;

/*
 * Ej13.java
 * 
 * Daniel García Mesa 3/12/2022
 * 
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 * 
 */


public class Ej13 {
	
	public static void main (String[] args) {
		
		int n=0;
		Scanner s=new Scanner(System.in);
		int pos=0;
		int neg=0;
		
		for(int i=0;i<10;i++){
			
			System.out.print("Introduzca numeros enteros: ");
			n=s.nextInt();
			
			if(n<0){
				neg++;
			}	else{
					pos++;
			}

		}
		System.out.print("El número de positivos es: "+pos+" y el número de negativos es: "+neg);
	}
}

