import java.util.Scanner;

/*
 * Ej19.java
 * 
 * Daniel García Mesa 23/11/2022
 * 
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
 * puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 * 
 * 
 */


public class Ej19 {
	
	public static void main (String[] args) {
		
		//declaración de variables
		
		Scanner s=new Scanner(System.in);
		int n=0;
		int x=0;
		//lectura de datos por teclado
		
		System.out.print("Introduce un número entero: ");
		n=s.nextInt();
		
		//cálculo cifra
		if(n<0){
			n=-n;
		}
		if(n<10){		
			x=1;
		}	else if(n<100){		
			x=2;
		}	else if(n<1000){		
			x=3;
		}	else if(n<10000){		
			x=4;
		}	else if(n<100000){		
			x=5;
		}
		
		//Salida por pantalla
		if(x==0){
			System.out.print("Fuera de rango");
		}	else{
				System.out.print("El número de cifras es: "+x); 
			}
		
	}
}

