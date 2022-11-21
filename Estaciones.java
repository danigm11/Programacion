import java.util.Scanner;

/*
 * Estaciones.java
 * 
 * Daniel García Mesa 18/11/2022
 * 
 * Switch con las estaciones del año.
 * 
 * 
 */


public class Estaciones {
	
	public static void main (String[] args) {
		
		int n=0;
		System.out.print("Introducir un mes del anyo (1 al 12): ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		switch(n){
			case 1:
			case 2:
				System.out.print("Invierno ");
				break;
			case 3:
			case 4:
			case 5:
				System.out.print("Primavera ");
				break;	
			case 6:
			case 7:
			case 8:
				System.out.print("Verano ");
				break;
			case 9:
			case 10:
			case 11:
				System.out.print("Otonyo ");
				break;
			case 12:
				System.out.print("Invierno ");
				break;	
			default:
			System.out.print("Mes equivocado");
		}
		
	}
}

