import java.util.Scanner;

/*
 * Ej18.java
 * 
 * Daniel García Mesa 23/11/2022
 * 
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 * 
 */


public class Ej18 {
	
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
			x=n;
		}	else if(n<100){		
			x=n/10;
		}	else if(n<1000){		
			x=n/100;
		}	else if(n<10000){		
			x=n/1000;
		}	else if(n<100000){		
			x=n/10000;
		}
		
		//Salida por pantalla
		if(x==0){
			System.out.print("Fuera de rango");
		}	else{
				System.out.print("La primera cifra del número es: "+x); 
			}
		
	}
}

