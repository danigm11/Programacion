import java.util.Scanner;

/*
 * Ej6.java
 * 
 * Daniel García Mesa 09/01/2023
 * 
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 0
 * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
 * la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
 * del array.
 * 
 * 
 */


public class Ej6 {
	
	public static void main (String[] args) {
		
		int[] array = new int[15];
		int aux=0;
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<15;i++){
			if(i==0){
				System.out.print("Introduzca el primer numero: ");
			}	else{
					System.out.print("Introduzca el siguiente numero: ");
			}
			array[i]=s.nextInt();
		}
		aux=array[14];
		for(int i=14;i>=0;i--){
			if(i==0){
				array[i]=aux;
			}	else{
					array[i]=array[i-1];
			}
		}
		for(int i=0;i<15;i++){
			System.out.print(array[i]+"  ");
		}
	}
}

