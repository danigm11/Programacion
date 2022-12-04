import java.util.Scanner;

/*
 * Ej10.java
 * 
 * Daniel García Mesa 3/12/2022
 * 
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 * 
 * 
 */


public class Ej10 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		double n=0;
		double suma=0;
		double media=0;
		int cont=0;
		
		
		do{
		System.out.print("Introduzca un número(negativo para terminar): ");
		n=s.nextInt();
		if(n>=0){
		suma+=n;
		cont++;
		}
		}while(n>=0);
		
		media=suma/cont;
		System.out.print("La media es: "+media);
		
	}
}

