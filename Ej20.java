import java.util.Scanner;

/*
 * Ej20.java
 * 
 * Daniel García Mesa 24/11/2022
 * 
 * Realiza un programa que diga si un número entero positivo introducido por
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 * 
 * 
 */


public class Ej20 {
	
	public static void main (String[] args) {
		
		//declaración de variables
		Scanner s=new Scanner(System.in);
		int n=0;
		int x=0;
		boolean cap=false;
		
		//lectura de datos
		System.out.print("Introducir un numero entero: ");
		n=s.nextInt();
		
		//cálculo si es capicúa o no y si tiene hasta 6 cifras
		if(n<0){
			n=-n;
		}
		if(n<10){		
			cap=true;
			x=1;
		}	else if(n<100){		
				x=2;
				if((n/10)==(n%10)){
					cap=true;
				}
		}	else if(n<1000){		
			x=3;
			if((n/100)==(n%10)){
					cap=true;
				}
		}	else if(n<10000){		
			x=4;
			if((((n/1000)*10)+(n/100%10))==((n/10%10)+((n%10)*10))){
					cap=true;
				}
		}	else if(n<100000){		
			x=5;
			if((((n/10000)*10)+(n/1000%10))==((n/10%10)+((n%10)*10))){
					cap=true;
				}
		}
		
		//Salida por pantalla
		if(x==0){
			System.out.print("Fuera de rango");
		}	else if(cap==true){
				System.out.print("El número es capicúa"); 
		}	else{
				System.out.print("El número no es capicúa");
		}
	}
}

