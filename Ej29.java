import java.util.Scanner;

/*
 * Ej29.java
 * 
 * Daniel García Mesa 27/11/2022
 * 
 * Realiza un programa que calcule el precio de un desayuno. El programa
 * preguntará primero qué ha tomado el usuario de comer: palmera, donut o
 * pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
 * programa debe preguntar además si era con aceite o con tortilla; el primero
 * vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
 * café a 1’50 y 1’20 respectivamente.
 * 
 * 
 */


public class Ej29 {
	
	public static void main (String[] args) {
				
		//Declaración de variables
		Scanner s=new Scanner(System.in);
		String tipo="";
		String add="";
		String bebida="";
		double precio=1.20;
		
		//lectura de datos por pantalla
		
		System.out.print("Que ha comido?(pitufo palmera o donut): ");
		tipo=s.next();
		if(tipo.equalsIgnoreCase("pitufo")){
			System.out.print("Con aceite o torilla?: ");
			add=s.next();
		}
		System.out.print("Bebida?(cafe o zumo): ");
		bebida=s.next();
		
		//Cálculo del precio
		
		if(tipo.equalsIgnoreCase("palmera")){
			precio=1.40;
			
		} else if(tipo.equalsIgnoreCase("donut")){
				precio=1;
			
		} else if(add.equalsIgnoreCase("torilla")){
				precio=1.60;
		}
		
		if(bebida.equalsIgnoreCase("zumo")){
			precio+=1.50;
		}	else if(bebida.equalsIgnoreCase("cafe")){
				precio+=1.20;
		}

		
		//Salida por pantalla
		
		System.out.printf("Precio final: %.2f",precio);
	}
		
}


