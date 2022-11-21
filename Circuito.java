import java.util.Scanner;

/*
 * Circuito.java
 * 
 * Daniel García Mesa 
 * 
 * Circuito entre Málaga y Valencia que muestra ciudades y localidades del recorrido dependiendo del punto de salida
 * 
 */


public class Circuito {
	
	public static void main (String[] args) {
		
		System.out.print("Introduzca un punto de entrada al recorrido(entre 1 y 13): ");
		int n=0;
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		String c1="Málaga, ";
		String c2="Granada, ";
		String c3="Alicante, ";
		String c4="Valencia";
		String l1="Rincón de la Victoria, ";
		String l2="Vélez Málaga, ";
		String l3="Nerja, ";
		String l4="Loja, ";
		String l5="Motril, ";
		String l6="Santa Fe, ";
		String l7="Albatera, ";
		String l8="Boteig, ";
		String l9="Elche, ";
		String recorrido="";
		
		switch(n){
			case 1:
				recorrido+=c1;
			case 2:
				recorrido+=l1;
			case 3:
				recorrido+=l2;
			case 4:
				recorrido+=l3;
			case 5:
				recorrido+=c2;
			case 6:
				recorrido+=l4;
			case 7:
				recorrido+=l5;
			case 8:
				recorrido+=l6;
			case 9:
				recorrido+=c3;
			case 10:
				recorrido+=l7;
			case 11:
				recorrido+=l8;
			case 12:
				recorrido+=l9;
			case 13:
				recorrido+=c4;
				System.out.print("El recorrido será: "+recorrido);
				break;
			default:
			System.out.print("Punto de entrada erróneo.");
		}
	}
}

