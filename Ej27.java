import java.util.Scanner;

/*
 * Ej27.java
 * 
 * Daniel García Mesa 25/11/2022
 * 
 * Una pastelería nos ha pedido realizar un programa que haga presupuestos de
 * tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
 * manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
 * 16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
 * además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
 * segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
 * nombre; la nata suma 2.50 y la escritura del nombre 2.75.
 * 
 */


public class Ej27{
	
	public static void main (String[] args) {
		
		//Declaración de variables
		
		Scanner s=new Scanner(System.in);
		String tipo="";
		String choco="";
		int nombre=0;
		int nata=0;
		double precio=14;
		
		//lectura de datos por pantalla
		
		System.out.print("Introduzca el tipo de tarta(fresa chocolate o manzana): ");
		tipo=s.next();
		if(tipo.equalsIgnoreCase("chocolate")){
			System.out.print("Chocolate blanco o negro?: ");
			choco=s.next();
		}
		System.out.print("Quiere nata?(1 si / 2 no): ");
		nata=s.nextInt();
		System.out.print("Quiere su nombre en la tarta? (1 si/2 no): ");
		nombre=s.nextInt();
		
		//Cálculo del precio
		
		if(tipo.equalsIgnoreCase("manzana")){
			precio=18;
			
		} else if(tipo.equalsIgnoreCase("fresa")){
				precio=16;
			
		} else if(choco.equalsIgnoreCase("blanco")){
					precio=15;
		}
		
		if(nata==1){
			precio+=2.50;
		}
		if(nombre==1){
			precio+=2.75;
		}
		
		//Salida por pantalla
		
		System.out.printf("Precio final: %.2f",precio);
	}
}

