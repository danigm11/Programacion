/*
 * Ej10.java
 * 
 * Daniel García Mesa 10/01/2023
 * 
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 * y que los almacene en un array. El programa debe ser capaz de pasar todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
 * necesario 
 */


public class Ej10 {
	
	public static void main (String[] args) {
		int par=0;
		int impar=0;
		
		int[] array=new int[20];
		int[] array2=new int[20];
		int[] array3=new int[20];
		
		for(int i=0;i<20;i++){
			array[i]=(int)(Math.random()*101);
			if(array[i]%2==0){
				array2[par]=array[i];
				par++;
			}	else{
					array3[impar]=array[i];
					impar++;
			}
		}
		for(int i=0;i<(20-par);i++){
			array2[i+par]=array3[i];
		}
		for(int i=0;i<20;i++){
			System.out.print(array2[i]+"  ");
		}
	}
}

