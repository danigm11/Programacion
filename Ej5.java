import java.util.Scanner;

/*
 * Ej5.java
 * 
 * Daniel García Mesa 15/11/2022
 * 
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0)
 * 
 */


public class Ej5 {
	
	public static void main (String[] args) {
		
		double a=0.0;
		double b=0.0;
		double resultado=0.0;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Este programa resuelve ecuaciones de primer grado (del tipo ax+b=0)");
		System.out.print("Por favor introduzca el valor de a: ");
		a=s.nextDouble();
		System.out.print("Ahora introduzca el valor de b: ");
		b=s.nextDouble();
	
		if(a==0){
			System.out.print("Esa ecuación no tiene solucion real.");
			
		} else{
				resultado=(-b/a);
				System.out.print("X = "+resultado);
		}
		
	}
}

