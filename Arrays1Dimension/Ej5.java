import java.util.Scanner;

/*
 * Ej5.java
 * 
 * Daniel García Mesa 09/01/2023
 * 
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 * 
 * 
 */


public class Ej5 {
	
	public static void main (String[] args) {
		
		int[] array = new int[10];
		Scanner s=new Scanner(System.in);
		int max=0;
		int min=9999;
		
		for(int i=0;i<10;i++){
			if(i==0){
				System.out.print("Introduzca el primer numero: ");
			}	else{
					System.out.print("Introduzca el siguiente numero: ");
			}
			array[i]=s.nextInt();
			if(array[i]>max){
				max=array[i];
			}
			if(array[i]<min){
				min=array[i];
			}
		}
		System.out.print("El maximo es: "+max+"  y el minimo es: "+min);
	}
}

