import java.util.Scanner;

/*
 * Ej28.java
 * 
 * Daniel García Mesa 27/11/2022
 * 
 * Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
 * su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
 * incorrecta, el programa deberá mostrar un mensaje de error.
 * 
 * 
 */


public class Ej28 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		Scanner s=new Scanner(System.in);
		String j1="";
		String j2="";
		String resultado="Error, prueba otra vez.";
		
		//Lectura por pantalla
		
		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
		j1=s.next();
		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
		j2=s.next();
		
		//Cálculo de resultados
		
		switch(j1){
		case "papel":{
		if(j2.equalsIgnoreCase("piedra")){
		resultado="Victoria j1";
		}
		if(j2.equalsIgnoreCase("tijera")){
		resultado="Victoria j2";
		}
		if(j1.equalsIgnoreCase(j2)){
			
			resultado="Empate";
		}	
		break;
		}
		case "tijera":{
		if(j2.equalsIgnoreCase("piedra")){
		resultado="Victoria j2";
		}
		if(j2.equalsIgnoreCase("papel")){
		resultado="Victoria j1";
		}
		if(j1.equalsIgnoreCase(j2)){
			
			resultado="Empate";
		}	
		break;
		}
		case "piedra":{
		if(j2.equalsIgnoreCase("papel")){
		resultado="Victoria j2";
		}
		if(j2.equalsIgnoreCase("tijera")){
		resultado="Victoria j1";
		}
		if(j1.equalsIgnoreCase(j2)){
			
			resultado="Empate";
		}	
		break;
		}
		}
		
		
		//Salida por pantalla;
		
		System.out.print("El resultado es: "+resultado);
	}
}

