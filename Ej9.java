import java.util.Scanner;

/*
 * Ej9.java
 * 
 * Daniel García Mesa 3/12/2022
 * 
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
 * la salvedad de que el anterior estaba limitado a números de 5 dígitos como
 * máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
 * esta manera, la única limitación en el número de dígitos la establece el tipo de
 * dato que se utilice (int o long). * 
 * 
 */


public class Ej9 {
	
	public static void main (String[] args) {
		
		
		
		//declaración de variables
		
		Scanner s=new Scanner(System.in);
		int n=0;
		int x=0;
		//lectura de datos por teclado
		
		do{
		System.out.print("Introduzca un número(limitado a 5 cifras): ");
		n=s.nextInt();
		if(n<0){
			n=-n;
		}
		}while(n>=100000);
		
		//cálculo cifra
		
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

