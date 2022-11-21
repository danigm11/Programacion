import java.util.Scanner;

/*
 * Ej1.java
 * 
 * Daniel García Mesa 18/11/2022
 * 
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 * 
 */


public class  Ej1{
	
	public static void main (String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n=0;
		
		System.out.print("Introduzca un número del 1 al 7 (lunes a domingo): ");
		n= s.nextInt();
		
		switch(n) {
			case 1:
				System.out.print("Lunes: Sistemas informaticos");
				break;
			case 2:
				System.out.print("Martes: Programación");
				break;
			case 3:
				System.out.print("Miércoles: Sistemas informaticos");
				break;
			case 4:
				System.out.print("Jueves: Programación");
				break;
			case 5:
				System.out.print("Viernes: Programación");
				break;	
			case 6:
				System.out.print("Sábado: No hay clase");
				break;
			case 7:
				System.out.print("Domingo: No hay clase");
				break;
			default:
				System.out.print("Día equivocado");
		}
		
	}
}

