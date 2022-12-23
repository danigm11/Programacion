import java.util.Scanner;

/*
 * Ej27.java
 * 
 * Daniel García Mesa 22/12/2022
 * 
 * Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
 * jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
 * introduce una opción incorrecta, el programa deberá mostrar un mensaje de
 * error.
 * 
 * 
 */


public class Ej27 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		String jugada="";
		String ord="";
		int n=(int)(Math.random()*3+1);
			System.out.print("Introduzca su jugada(piedra papel o tijeras): ");
			jugada=s.next();
		
		switch(n){
			case 1:{
				ord="papel";
				break;
			}
			case 2:{
				ord="tijeras";
				break;
			}
			case 3:{
				ord="piedra";
				break;
			}
		}
		System.out.println("Jugada del ordenador: "+ord);
		if(ord.equalsIgnoreCase(jugada)){
			System.out.print("Empate");
		}
		switch(jugada){
			case "papel":{
				if(ord.equalsIgnoreCase("tijeras")){
					System.out.print("Gana el ordenador!");
				}	else if(ord.equalsIgnoreCase("piedra")){
					System.out.print("Has ganado!");
				}
				break;
			}
			case "piedra":{
				if(ord.equalsIgnoreCase("papel")){
					System.out.print("Gana el ordenador!");
				}	else if(ord.equalsIgnoreCase("tijeras")){
					System.out.print("Has ganado!");
				}
				break;
			}
			case "tijeras":{
				if(ord.equalsIgnoreCase("piedra")){
					System.out.print("Gana el ordenador!");
				}	else if(ord.equalsIgnoreCase("papel")){
					System.out.print("Has ganado!");
				}
				break;
			}
			default:{
				System.out.print("Error");
			}
		}
	}
}

