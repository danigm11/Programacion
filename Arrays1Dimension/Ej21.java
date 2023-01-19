/*
 * Ej21.java
 * 
 * Daniel García Mesa 16/01/2023
 * 
 * Escribe un programa que rellene un array de 15 elementos con números enteros
 * comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
 * array “cincuerizado”, según el siguiente criterio: si el número que hay en una
 * posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
 * siguiente múltiplo de 5 que exista a partir de él.
 * 
 * 
 */


public class Ej21 {
	
	public static void main (String[] args) {
		
		final int tam=15;
		int[] array=new int[tam];
		
		System.out.println("Array original: ");
		
		for(int i=0;i<tam;i++){
			array[i]=(int)(Math.random()*501);
			System.out.print(array[i]+"  ");
		}
		
		System.out.println("\nArray cincuerizado: ");

		for(int i=0;i<tam;i++){
			if(array[i]%5!=0){
				array[i]+=(5-array[i]%5);
			}
			System.out.print(array[i]+"  ");
		}
	}
}


