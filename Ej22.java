import java.util.Scanner;

/*
 * Ej22.java
 * 
 * Daniel García Mesa 22/12/2022
 * 
 * Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
 * aleatorio. La cabeza se representará con el carácter @ y se debe colocar
 * exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
 * el cuerpo irá serpenteando de la siguiente manera: se generará de forma
 * aleatoria un valor entre tres posibles que hará que el siguiente carácter se
 * coloque una posición a la izquierda del anterior, alineado con el anterior o una
 * posición a la derecha del anterior. La longitud de la serpiente se pedirá por
 * teclado y se supone que el usuario introducirá un dato correcto.
 * 
 * 
 */


public class Ej22 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int largo=0;
		System.out.print("Introduzca el largo de la serpiente: ");
		largo=s.nextInt();
		
		System.out.println("            @");
		for(int i=0;i<largo;i++){
			int serp=(int)(Math.random()*3+1);
			
			for(int j=0;j<serp;j++){
				System.out.print(" ");
			}
			System.out.println("          *");
		}
		
	}
}

