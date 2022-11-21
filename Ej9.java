import java.util.Scanner;
import java.lang.Math;

/*
 * Ej9.java
 * 
 * Daniel garcía Mesa 17/11/2022
 * 
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
 * ax2 + bx + c = 0).
 * 
 * 
 */


public class Ej9 {
	
	public static void main (String[] args) {
		
		double a=0;
		double b=0;
		double c=0;
		double x=0;
		double y=0;
		double aux=0;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Este programa resuelve ecuaciones de segundo grado");
		System.out.print("Introduzca el valor de a: ");
		a=s.nextDouble();
		System.out.print("Introduzca el valor de b: ");
		b=s.nextDouble();
		System.out.print("Introduzca el valor de c: ");
		c=s.nextDouble();
		
		aux=((b*b)-(4*a*c));
		
		if((a==0)||(aux<0)){
			System.out.print("Esta ecuación no tiene solución real");
		} else{	
				x=(-b+(Math.sqrt(aux))/(2*a));
				y=(-b-(Math.sqrt(aux))/(2*a));
				System.out.print("Los resultados son: ");
				System.out.printf("%.4f",x);
				System.out.print(" y ");
				System.out.printf("%.4f",y);
		}
	}
}

