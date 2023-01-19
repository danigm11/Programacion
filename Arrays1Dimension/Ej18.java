import java.util.Scanner;

/*
 * Ej18.java
 * 
 * Daniel García Mesa 12/01/2023
 * 
 * Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
 * ambos incluidos y que los almacene en un array. A continuación, el programa
 * debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
 * programa debe colocar de forma alterna y en orden los menores o iguales de
 * 100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
 * mayor… Cuando se acaben los menores o los mayores, se completará con los
 * números que queden.
 * 
 * 
 */


public class Ej18 {
	
	public static void main (String[] args) {
		
		int tam=10;
		int[] array= new int[tam];
		int[] array2= new int[tam];
		int n=0;
		int cont=0;
		int aux=0;
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<tam;i++){
			array2[i]=(int)(Math.random()*201);
		}
		
		System.out.println("Array original:");
		System.out.println("┌─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
		System.out.print("|");
		
		for(int i=0;i<tam;i++){

			array[i]=i;
			System.out.printf("%-4s |",array[i]);
		}
		System.out.print("\n|");
		for(int i=0;i<tam;i++){
			System.out.printf("%-4s |",array2[i]);
		}
		
		for(int i=0;i<tam;i++){
				if((array2[i]<101)&&(cont<tam)){
					aux=array2[cont];
					array2[cont]=array2[i];
					array2[i]=aux;
					cont+=2;
				}
			}
		
		System.out.println("\nArray resultado:");
		System.out.println("┌─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
		System.out.print("|");
		
		for(int i=0;i<tam;i++){

			array[i]=i;
			System.out.printf("%-4s |",array[i]);
		}
		System.out.print("\n|");
		for(int i=0;i<tam;i++){
			System.out.printf("%-4s |",array2[i]);
			
		}
	}
}
