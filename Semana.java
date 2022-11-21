import java.util.Scanner;

/*
 * Semana.java
 * 
 * Daiel García Mesa 18/11/2022
 * 
 * 
 * Switch de los días de la semana.
 * 
 */


public class Semana {
	
	public static void main (String[] args) {
		
		int n=0;
		System.out.print("Introducir un día de la semana (1 al 7): ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		switch(n){
			case 1:
				System.out.print("Lunes");
				break;
			case 2:
				System.out.print("Martes");
				break;
			case 3:
				System.out.print("Miércoles");
				break;
			case 4:
				System.out.print("Jueves");
				break;
			case 5:
				System.out.print("Viernes");
				break;	
			case 6:
				System.out.print("Sábado");
				break;
			case 7:
				System.out.print("Domingo");
				break;	
			default:
			System.out.print("Día equivocado");
		}
		
	}
}

