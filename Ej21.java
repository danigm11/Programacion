import java.util.Scanner;

/*
 * Ej21.java
 * 
 * Daniel García Mesa 5/12/2022
 * 
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el cómputo.
 * 
 */


public class Ej21 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=0;
		int cont=0;
		int suma=0;
		int cont2=0;
		int mayor=0;
		do{
			System.out.print("Introduzca un número (negativo para terminar): ");
			n=s.nextInt();
			cont++;
			if((n>mayor)&&((n%2)==0)){
				mayor=n;
			}
			if((n%2)==1){
				suma+=n;
				cont2++;
			}
			
		}while(n>=0);
		
		System.out.println("Se han introducido "+(cont-1)+" numeros");
		System.out.println("El par mayor es: "+mayor);
		System.out.println("La media de los impares es: "+(suma/cont2));
		
		
	}
}

