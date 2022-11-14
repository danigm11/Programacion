import java.util.Scanner;

/*
 * Ej9.java
 * 
 * Daniel garcía Mesa 11/11/2022
 * 
 * 
 * Escribe un programa que calcule el volumen de un cono según la fórmula V =1/3πr2h
 * 
 */


public class Ej9 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		Double r=0.0;
		Double h=0.0;
		Double res=0.0;
		
		System.out.print("Introduzca el radio del cono: ");
		r=s.nextDouble();
		System.out.print("Introduzca la altura del cono: ");
		h=s.nextDouble();
		
		res=((r*r*h*3.141592)/3);
		System.out.print("El volumen del cono es: "+res);
		
		
	}
}

