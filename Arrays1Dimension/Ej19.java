import java.util.Scanner;

/*
 * Ej19.java
 * 
 * Daniel García Mesa 13/01/2023
 * 
 * Realiza un programa que sea capaz de insertar un número en una posición
 * concreta de un array. En primer lugar, el programa generará un array de 12
 * números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
 * debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
 * el programa preguntará por el número que se quiere insertar y por la posición
 * donde será insertado. Los números del array se desplazan a la derecha para
 * dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
 * siempre se perderá.
 * 
 * 
 */


public class Ej19 {
	
	public static void main (String[] args) {
		
		int tam=12;
		int[] array= new int[tam];
		Scanner s=new Scanner(System.in);
		int n=0;
		int n2=0;
		System.out.println("Array original:  ");
		System.out.print("Indice  ");
		for(int i=0;i<tam;i++){
			System.out.print(i+"   ");
		}
		System.out.print("\nValor ");
		for(int i=0;i<tam;i++){
			array[i]=(int)(Math.random()*201);
			System.out.printf("%4s",array[i]);
		}
		
		System.out.print("\nIntroduzca el numero que quiere insertar: ");
		n=s.nextInt();
		System.out.print("Introduzca la posicion donde lo quiere insertar(0<-11): ");
		n2=s.nextInt();
		
		System.out.println("Array resultado:  ");
		System.out.print("Indice  ");
		for(int i=0;i<tam;i++){
			System.out.print(i+"   ");
		}
		for(int i=(tam-1);i>n2;i--){
					array[i]=array[i-1];
			}
		array[n2]=n;
		System.out.print("\nValor ");
		for(int i=0;i<tam;i++){
			System.out.printf("%4s",array[i]);
		}
	}
}

