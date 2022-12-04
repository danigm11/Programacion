import java.util.Scanner;

/*
 * Ej12.java
 * 
 * Daniel García Mesa 3/12/2022
 * 
 * Escribe un programa que muestre los n primeros términos de la serie de
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
 * el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
 * términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
 * introducir por teclado.
 * 
 * 
 */


public class Ej12 {
	
	public static void main (String[] args) {
		
		int n=0;
		int num=1;
		int aux=1;
		int aux2=0;
		Scanner s=new Scanner(System.in);
		
		do{
		System.out.print("Introduzca el numero de terminos que visualizar: ");
		n=s.nextInt();
		}while(n<0);
		
		System.out.print("0 ");
		
		for(int i=1;i<n;i++){
			System.out.print(num+" ");
			num=aux2+aux;
			aux2=aux;
			aux=num;
		}
		
		
	}
}

